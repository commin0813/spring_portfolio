package org.commin.blog.api.controller.web;

import org.commin.blog.api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

	@Autowired(required = false)
	private SkillService skillService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("skill_list", skillService.list());
		return "index";
	}
}

package org.commin.blog.api.controller.web;

import org.commin.blog.api.dto.enumclass.SkillType;
import org.commin.blog.api.repository.IntroRepository;
import org.commin.blog.api.service.IntroService;
import org.commin.blog.api.service.ProjectService;
import org.commin.blog.api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

	@Autowired(required = false)
	private SkillService skillService;

	@Autowired(required = false)
	private IntroService introService;

	@Autowired(required = false)
	private ProjectService projectService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("skill_list", skillService.list());
//		model.addAttribute("skill_list_database", skillService.list(SkillType.DATABASE));
//		model.addAttribute("skill_list_lang", skillService.list(SkillType.LANGUAGE));
		model.addAttribute("intro_list", introService.list());
		model.addAttribute("project_list", projectService.list());
		return "index";
	}
	
	@RequestMapping("/exam")
	public String exam() {
		return "exam";
	}
}

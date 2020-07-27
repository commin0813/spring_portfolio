package org.commin.blog.api.controller;

import java.util.List;

import org.commin.blog.api.dto.Skill;
import org.commin.blog.api.dto.enumclass.SkillType;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestSkill;
import org.commin.blog.api.dto.network.response.ResponseSkill;
import org.commin.blog.api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill")
public class SkillController extends CrudController<RequestSkill, ResponseSkill, Skill> {

	@Autowired
	private SkillService skillService;
	
	@GetMapping("list/option")
	public Header<List<ResponseSkill>> list(SkillType skillType) {
		return skillService.list(skillType);
	}

//	@Autowired(required = false)
//	private BaseService<RequestSkill, ResponseSkill, Skill> baseService;
//
//	@Override
//	@PostMapping("")
//	public Header<ResponseSkill> create(@RequestBody Header<RequestSkill> request) {
//		return baseService.create(request);
//	}
//
//	@Override
//	@GetMapping("{id}")
//	public Header<ResponseSkill> read(@PathVariable Long id) {
//		return baseService.read(id);
//	}
//
//	@Override
//	@GetMapping("list")
//	public Header<List<ResponseSkill>> list() {
//		return baseService.list();
//	}
//
//	@Override
//	@PutMapping("")
//	public Header<ResponseSkill> update(@RequestBody Header<RequestSkill> request) {
//		return baseService.update(request);
//	}
//
//	@Override
//	@DeleteMapping("{id}")
//	public Header delete(@PathVariable Long id) {
//		return baseService.delete(id);
//	}
}

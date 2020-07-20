package org.commin.blog.api.controller;

import org.commin.blog.api.dto.Skill;
import org.commin.blog.api.dto.network.request.RequestSkill;
import org.commin.blog.api.dto.network.response.ResponseSkill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skill")
public class SkillController extends CrudController<RequestSkill, ResponseSkill, Skill> {

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

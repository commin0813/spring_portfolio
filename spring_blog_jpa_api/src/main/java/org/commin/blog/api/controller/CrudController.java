package org.commin.blog.api.controller;

import java.util.List;

import org.commin.blog.api.controller.ifs.CrudInterface;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.service.ifs.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class CrudController<Req, Res, Entity> implements CrudInterface<Req, Res> {
	@Autowired(required = false)
	protected BaseService<Req, Res, Entity> baseService;

	@Override
	@PostMapping("")
	public Header<Res> create(@RequestBody Header<Req> request) {
		return baseService.create(request);
	}

	@Override
	@GetMapping("{id}")
	public Header<Res> read(@PathVariable Long id) {
		return baseService.read(id);
	}

	@Override
	@GetMapping("list")
	public Header<List<Res>> list() {
		return baseService.list();
	}

	@Override
	@PutMapping("")
	public Header<Res> update(@RequestBody Header<Req> request) {
		return baseService.update(request);
	}

	@Override
	@DeleteMapping("{id}")
	public Header delete(@PathVariable Long id) {
		return baseService.delete(id);
	}
}

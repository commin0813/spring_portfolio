package org.commin.blog.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo/{id}")
	public String demo(@PathVariable int id) {
		return "<h2>"+id+"</h2>";
	}
}

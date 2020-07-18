package org.commin.blog.api.controller.web;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
}

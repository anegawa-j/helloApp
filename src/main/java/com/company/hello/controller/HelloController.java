package com.company.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method= RequestMethod.GET)
	public String hello() {
		return "Hello Spring MVC";
	}

	@RequestMapping(value= "/sayYes", method = RequestMethod.GET)
	public String sayYes() {
		return "Say Yes!!!!!";
	}
}

package com.company.hello.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

	private final JdbcTemplate jdbc;

	@RequestMapping(method= RequestMethod.GET)
	public String hello() {

		String userName = jdbc.queryForObject("SELECT user_name FROM user limit 1", String.class);
		System.out.println("userName = " + userName);

		return "Hello Spring MVC";
	}

	@RequestMapping(value= "/sayYes", method = RequestMethod.GET)
	public String sayYes() {
		return "Say Yes!!!!!";
	}
}

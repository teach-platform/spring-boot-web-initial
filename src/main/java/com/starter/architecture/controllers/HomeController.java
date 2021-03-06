package com.starter.architecture.controllers;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/")
	public String home(Map<String, Object> model) {

		model.put("message", this.message);
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/show")
	public String show() {
		return "/show";
	}

}

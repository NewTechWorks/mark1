package com.app.mark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

	@GetMapping("/")
	public String one() {
		return "Welcome one Method";
	}
	
	@GetMapping("/welcome")
	public String two() {
		return "Welcome to Heroku";
	}
	
}

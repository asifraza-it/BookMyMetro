package com.upmrc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
	
	@GetMapping("/")
	public String welcome() {
		
		// logic
		return "Welcome to BookMyMetro App";
	}

}

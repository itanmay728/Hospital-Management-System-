package com.example.HospitalManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegisterpage() {
		return "register";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	
}

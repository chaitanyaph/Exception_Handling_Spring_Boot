package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		
		model.addAttribute("msg", "Welcome To Ashok IT....");
		
		String name = null;
		name.length();
		
		return "welcome";
	}
	
	@RequestMapping(value="/greet")
	public String greet(Model model) {
		
		model.addAttribute("msgGreet", "Wishing you a wonderful day filled with joy and success!");
		return "greet";
		
	}
}

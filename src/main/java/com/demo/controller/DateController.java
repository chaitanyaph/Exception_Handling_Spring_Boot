package com.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping(value= "/date")
	public String date(Model model) {
		
		model .addAttribute("msg", "Today's Date is : "+new Date());
		String name = null;
		name.length();
		return "date";
	}
}

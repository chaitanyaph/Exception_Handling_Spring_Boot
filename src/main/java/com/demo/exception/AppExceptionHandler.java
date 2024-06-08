package com.demo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value= NullPointerException.class)
	public String exceptionHandler(Model model) {
		
		model.addAttribute("errMsg", "Some Problem Occured, Please Try Again Later");
		return "error";
	}
}

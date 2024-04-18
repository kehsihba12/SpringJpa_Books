package com.example.controller;

import com.example.binder.MyBinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/")
	public String getData(ModelAndView model) {
		
		MyBinder mb = new MyBinder();
		model.addObject("msg", mb);
		
		return "index";
	}

}

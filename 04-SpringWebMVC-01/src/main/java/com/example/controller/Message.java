package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Message {

	@GetMapping("/welcome")
	public ModelAndView getMessge() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("msg", "Good morning .......?");
		return mv;
	}
	
	
	@GetMapping("/greet")
	public ModelAndView getGreet() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		mv.addObject("msg", "Hi good evening Maccha");
		
		return mv;
		
	}
}

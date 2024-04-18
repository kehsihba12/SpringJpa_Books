package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Book;
import com.example.repo.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/books")
	public ModelAndView getBookByID(@RequestParam("id") Integer id ) {
		
		ModelAndView  mv = new ModelAndView();
		Optional<Book> gt = repo.findById(id);
		System.out.println(id);
		if(gt.isPresent()) {
			Book bookObj = gt.get();
			System.out.println(bookObj);
			mv.addObject("book",bookObj);
		}
		mv.setViewName("index");
		
		return mv;
	}

}

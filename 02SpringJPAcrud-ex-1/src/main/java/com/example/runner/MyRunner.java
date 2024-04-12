package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Books;
import com.example.repo.MyRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private MyRepository repo;
	
	
	public void run(String... args) throws Exception {
		Books b = new Books();
		b.setBookId(001);
		b.setBookName("java");
		b.setBookPrice(1000.0);
		repo.save(b);
		

	}

}

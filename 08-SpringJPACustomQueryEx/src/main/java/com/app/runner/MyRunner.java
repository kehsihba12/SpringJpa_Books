package com.app.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Employee;
import com.app.repo.MyRepository;


@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private MyRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.getAllEmps().forEach(System.out::println);
		
		
		
	}

}

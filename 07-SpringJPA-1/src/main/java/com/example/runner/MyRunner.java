package com.example.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.entity.MyBook;
import com.example.repo.MyRepo;


@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private MyRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
	List<MyBook> byBookType = repo.findByBookType("backend");
	byBookType.forEach(System.out::println);

	}

}

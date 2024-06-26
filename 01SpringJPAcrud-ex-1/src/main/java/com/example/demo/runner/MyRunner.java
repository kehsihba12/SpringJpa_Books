package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;
import com.example.demo.repo.MyRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	
	@Autowired
	private MyRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(1,"phone",500);
		Product p2 = new Product(2,"underwaRE",500);
		Product p3 = new Product(3,"Chaddi",600);
		
		// insert if key is not provide else update with the new data From the same key both update and insert will happen with save method in the JPA 
		repo.save(p1);
		// saving multiple objects in one go
		repo.saveAll(Arrays.asList(p1,p2,p3));
		
		// count method is used to count the number of rows present in the Table
		System.out.println(repo.count());
		
		// find Data by primary key id it will return boolean 
		System.out.println(repo.findById(3));
		System.out.println(repo.findById(5));
		
		
		Iterable<Product> all = repo.findAll();
		all.forEach(a -> System.out.println(a));
		
		repo.deleteById(3);
		
		
	}
	

}

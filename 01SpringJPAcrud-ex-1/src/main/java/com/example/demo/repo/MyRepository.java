package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;

public interface MyRepository extends CrudRepository<Product, Integer>{
	
	

}

package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Product;

public interface MyRepositoty extends JpaRepository<Product, Integer> {

	
}

package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Books;

public interface MyRepository extends CrudRepository<Books, Integer> {
	

}

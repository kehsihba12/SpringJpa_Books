package com.example.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.MyBook;

public interface MyRepo extends JpaRepository<MyBook, Integer>{
	
	
	List<MyBook> findByBookType(String bookType);
	
	

}

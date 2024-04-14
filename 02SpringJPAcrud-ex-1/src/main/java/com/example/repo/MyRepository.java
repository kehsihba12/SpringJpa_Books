package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Books;

public interface MyRepository extends JpaRepository<Books, Integer> {
	
	@Query(value = "insert into books values(002,'python',1000.0 )" , nativeQuery = true)
	public boolean insert();
	

}

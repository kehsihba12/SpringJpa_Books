package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.Employee;

public interface MyRepository extends JpaRepository<Employee, Integer> {
	
	@Query("from Employee ")
	List<Employee> getAllEmps();

}

package com.app.repo2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.EmployeeEntity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

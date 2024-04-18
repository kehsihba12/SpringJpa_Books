package com.app.repo1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.deptEntiy.DepartMent;

public interface DepartmentRepository extends JpaRepository<DepartMent, Integer> {

}

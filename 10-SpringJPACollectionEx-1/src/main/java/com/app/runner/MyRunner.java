package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.EmployeeEntity.Employee;
import com.app.deptEntiy.DepartMent;
import com.app.repo1.DepartmentRepository;
import com.app.repo2.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	@Override
	public void run(String... args) throws Exception {
		
		Employee e = new Employee();
		e.setEmpID(101);
		e.setEmpDept("QA");
		e.setEmpName("ammu");
		e.setEmpSal(12345.0);
		
		DepartMent dp = new DepartMent();
		dp.setDdeptId(1);
		dp.setMangerId("M");
		e.setDept(dp);
		
		drepo.save(dp);
		erepo.save(e);
		
	

	}

}

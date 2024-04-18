package com.app.EmployeeEntity;

import com.app.deptEntiy.DepartMent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	private Integer EmpID;
	private String EmpName;
	private String EmpDept;
	private Double empSal;
	
	@OneToMany
	@JoinColumn(name="deptFK")
	private DepartMent dept;

}

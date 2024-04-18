package com.app.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="studenttab")
public class Student {
	
	@Id
	private Integer studentId;
	
	private String studentName;
	
	private String studentAddr;
	
	@ManyToMany
	@JoinTable(
			name="stucrstab",
			joinColumns =@JoinColumn(name="sidFk"),
			inverseJoinColumns=@JoinColumn(name="crsFk")
			)
	private List<Course> course;

}

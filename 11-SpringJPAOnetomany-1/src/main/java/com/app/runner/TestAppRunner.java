package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.repo.CourseRepository;
import com.app.repo.StudentRepository;

@Component
public class TestAppRunner implements CommandLineRunner {

	
	@Autowired
	private StudentRepository srepo;
	
	@Autowired
	private CourseRepository crepo;
	
	
	public void run(String... args) throws Exception {
		
		Course c1 = new Course();
		c1.setCourseFee(600.0);
		c1.setCourseName("SpringBoot");
		c1.setCourseId(50);
		
		
		Course c2 = new Course(51,"Angular",800.0);
		crepo.save(c1);
		crepo.save(c2);
		
		Student s1 = new Student(10,"Abhi","Raichur",Arrays.asList(c1,c2));
		Student s2 = new Student(11,"ammu","Belagavi",Arrays.asList(c1,c2));
		
		srepo.save(s1);
		srepo.save(s2);
		
		
		
	}

}

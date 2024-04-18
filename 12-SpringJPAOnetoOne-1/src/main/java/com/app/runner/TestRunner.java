package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Role;
import com.app.entity.User;
import com.app.repo.*;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private UserRepository urepo;
	@Autowired
	private ReleRepository Rrepo;
	
	
	
	public void run(String... args) throws Exception {
		
		
		Role role = new Role(101,"Dev");
		Role role1 = new Role(102,"Test");
		
		Rrepo.save(role);
		Rrepo.save(role1);
		
		User u1 = new User(1,"ammu","ammu@gmail.com",role);
		User u2 = new User(2,"abhi","abhi@gmail.com",role1);
		
		urepo.save(u1);
		urepo.save(u2);
		
		
		
		
		
		

	}

}

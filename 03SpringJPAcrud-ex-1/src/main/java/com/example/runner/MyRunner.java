package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Account;
import com.example.entitypk.AccountPK;
import com.example.repo.MyRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private MyRepository repo;

	@Override
	public void run(String... args) throws Exception {
			
		AccountPK apk = new AccountPK();
		apk.setAccno(1234);
		apk.setAccType("savings");
		
		Account a = new Account();
		a.setAccountHolderName("abhishek");
		a.setBrnach("masski");
		
		a.setAccountpk(apk);
		repo.save(a);
	}

}

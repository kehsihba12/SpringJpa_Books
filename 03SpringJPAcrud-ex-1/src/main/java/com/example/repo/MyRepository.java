package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;
import com.example.entitypk.AccountPK;

public interface MyRepository extends JpaRepository<Account, AccountPK> {

	

}

package com.example.entity;

import com.example.entitypk.AccountPK;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Account {

	private String accountHolderName;
	
	private String brnach;
	
	@EmbeddedId
	private AccountPK accountpk;
}

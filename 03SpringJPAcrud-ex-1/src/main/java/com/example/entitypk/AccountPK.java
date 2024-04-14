package com.example.entitypk;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPK {
	
	private int accno;
	private String accType;

}

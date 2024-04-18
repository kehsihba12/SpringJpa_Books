package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	
	@Id
	private Integer userId;
	private String  userName;
	private String userMail;
	
	
	
	@ManyToOne
	@JoinColumn(name="roleFk",unique = true
			)
	private Role role;
	
	

}

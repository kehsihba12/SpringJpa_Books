package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Books {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	

}

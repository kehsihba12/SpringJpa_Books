package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="books")
public class Book {
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}

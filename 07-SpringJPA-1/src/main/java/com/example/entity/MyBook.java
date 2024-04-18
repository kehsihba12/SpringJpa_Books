package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="b_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class MyBook {
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	private String bookType;

}

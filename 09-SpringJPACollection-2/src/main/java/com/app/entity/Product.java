package com.app.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private Integer prodId;
	private String prodName;
	
	
	@ElementCollection
	@CollectionTable(
			name = "prod_value",
			joinColumns = @JoinColumn(name="prodFk")
			)
	@Column(name="pob")
	@OrderColumn(name="v_values")
	List<Integer> values;
	
	@ElementCollection
	@CollectionTable(
			name = "prod_names",
			joinColumns = @JoinColumn(name="prodFk")
			)
	@Column(name="names")
	@MapKeyColumn(name="cs")
	Map<String,String> names;
	
	@ElementCollection
	@CollectionTable(
			name = "prod_colours",
			joinColumns = @JoinColumn(name="prodFk")
			)
	@Column(name="color")
	Set<String> colurs;
	
	

}

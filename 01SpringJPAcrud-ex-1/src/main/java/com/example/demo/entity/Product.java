package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table
public class Product {
	
	@Id
	private Integer pid;
	private String pname;
	private Integer pcost;
	
	
	public Product() {
		super();
	}


	public Product(Integer pid, String pname, Integer pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Integer getPcost() {
		return pcost;
	}


	public void setPcost(Integer pcost) {
		this.pcost = pcost;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	

}

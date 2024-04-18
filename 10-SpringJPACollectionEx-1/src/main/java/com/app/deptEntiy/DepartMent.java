package com.app.deptEntiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DepartMent {
	
	@Id
	@Column(name="deptFK")
	private Integer DdeptId;
	
	private String mangerId;
	
	

}

package com.kmb.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Dept {

	@Id
	@GeneratedValue
	Short deptno;
	
	String dname;
	String loc;
	
}

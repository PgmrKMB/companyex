package com.kmb.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class EMP {

	@Id
	@GeneratedValue
	private int empno;
	
	String ename;
	String job;
	String mgr;
	String hiredate;
	Integer sal;
	Integer comm;
	
	@ManyToOne
	@JoinColumn(name = "deptno")
	Dept dept;
	
}

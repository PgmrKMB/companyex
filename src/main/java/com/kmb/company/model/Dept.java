package com.kmb.company.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Dept {

	@Id
	@GeneratedValue
	Short deptno;
	
	String dname;
	String loc;
	
	@JsonIgnore
	@OneToMany(mappedBy = "dept" , fetch = FetchType.EAGER)
	List<EMP> emps = new ArrayList<>();
	
}

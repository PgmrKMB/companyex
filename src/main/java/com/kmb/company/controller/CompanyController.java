package com.kmb.company.controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.kmb.company.model.EMP;
import com.kmb.company.repository.DeptRepository;
import com.kmb.company.repository.EmpRepository;

@RestController
public class CompanyController {

	@Autowired
	EmpRepository empr;
	
	@Autowired
	DeptRepository deptr;
	
	@GetMapping("company")
	public void comp() {
		
		Optional<EMP> opt = empr.findById(0);
		EMP emp = opt.get();

		String dname = emp.getDept().getDname(); // join
		System.out.println(dname);

		
		
	}
}

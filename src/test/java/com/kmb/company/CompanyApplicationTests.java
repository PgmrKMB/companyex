package com.kmb.company;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmb.company.model.EMP;
import com.kmb.company.repository.DeptRepository;
import com.kmb.company.repository.EmpRepository;

@SpringBootTest
class CompanyApplicationTests {

	@Autowired
	EmpRepository empr;
	
	@Autowired
	DeptRepository deptr;
	
	
	@Test
	public void comp() {

		List<EMP> empl = empr.findAll();
		System.out.println(empl);

	}
}

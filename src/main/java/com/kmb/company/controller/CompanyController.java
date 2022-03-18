package com.kmb.company.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
	public List<Map<String, Object>> comp() {

		List<EMP> empl = empr.findAll();
		List<Map<String, Object>> lists = new ArrayList<>();
		for (EMP i : empl) {

			String ename = i.getEname();
			String dname = i.getDept().getDname();
			String loc = i.getDept().getLoc();

			Map<String, Object> map = new HashMap<>();

			map.put("ename", ename);
			map.put("dname", dname);
			map.put("loc", loc);
			lists.add(map);
		}
		
		return lists;
	}
	
	@GetMapping("company2")
	public List<EMP> comp2() {
		List<EMP> empl = empr.findAll();
		
		return empl;
	}
	

}

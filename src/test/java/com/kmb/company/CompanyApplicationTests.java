package com.kmb.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmb.company.model.Dept;
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

		for (EMP i : empl) {

			String ename = i.getEname();
			String dname = i.getDept().getDname();
			String loc = i.getDept().getLoc();

			Map<String, Object> map = new HashMap<>();

			map.put("ename", ename);
			map.put("dname", dname);
			map.put("loc", loc);

			System.out.println(map);
		}
	}

	@Test
	public void comp2() {

		List<Dept> depts = deptr.findAll();
		System.out.println(depts);

	}
}

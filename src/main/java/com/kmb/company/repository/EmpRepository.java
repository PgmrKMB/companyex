package com.kmb.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmb.company.model.EMP;



public interface EmpRepository extends JpaRepository<EMP, Integer>{

}

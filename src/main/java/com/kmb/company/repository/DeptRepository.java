package com.kmb.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmb.company.model.Dept;


public interface DeptRepository extends JpaRepository<Dept, Short> {

}

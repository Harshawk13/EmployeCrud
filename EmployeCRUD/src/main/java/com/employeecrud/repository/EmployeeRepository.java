package com.employeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeecrud.model.Employe;

public interface EmployeeRepository extends JpaRepository<Employe, Integer>{

}

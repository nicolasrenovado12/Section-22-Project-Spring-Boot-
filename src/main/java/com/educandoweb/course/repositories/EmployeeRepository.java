package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

package com.demo.rest.demo.repository;

import com.demo.rest.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer> {
}

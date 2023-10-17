package com.demo.rest.demo.service;

import com.demo.rest.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getoneEmployee(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);


    void deleteEmployee(int id);
}

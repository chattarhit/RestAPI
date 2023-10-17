package com.demo.rest.demo.service;

import com.demo.rest.demo.entity.Employee;
import com.demo.rest.demo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private Employeerepository employeerepository;

    @Override
    public List<Employee> getEmployees() {
        return employeerepository.findAll();
    }

    @Override
    public Employee getoneEmployee(int id) {
        return employeerepository.getOne(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeerepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeerepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = employeerepository.getReferenceById(id);
        employeerepository.delete(employee);
    }


}

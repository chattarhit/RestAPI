package com.demo.rest.demo.controller;

import com.demo.rest.demo.entity.Employee;
import com.demo.rest.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return this.employeeService.getEmployees();
    }

    @GetMapping("/employee/{empId}")
    public Employee getOne(@PathVariable String courseId){
        return this.employeeService.getoneEmployee(Integer.parseInt(courseId));

    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);

    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{empId}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId){
        try {
            this.employeeService.deleteEmployee(Integer.parseInt(employeeId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus. INTERNAL_SERVER_ERROR);
        }
    }


}

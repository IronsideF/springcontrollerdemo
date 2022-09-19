package com.codeclan.employeetracker.employeeservice.controllers;

import com.codeclan.employeetracker.employeeservice.models.Employee;
import com.codeclan.employeetracker.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}

package com.AsgarGeorge.employeemanagementapi.controller;


import com.AsgarGeorge.employeemanagementapi.model.Employee;
import com.AsgarGeorge.employeemanagementapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public Employee  createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return employee;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
       return employeeService.getAllEmployee();
    }


}

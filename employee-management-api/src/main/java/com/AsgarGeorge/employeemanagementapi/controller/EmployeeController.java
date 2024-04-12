package com.AsgarGeorge.employeemanagementapi.controller;


import com.AsgarGeorge.employeemanagementapi.model.Employee;
import com.AsgarGeorge.employeemanagementapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}

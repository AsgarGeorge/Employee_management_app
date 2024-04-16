package com.AsgarGeorge.employeemanagementapi.services;

import com.AsgarGeorge.employeemanagementapi.model.Employee;
import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
package com.AsgarGeorge.employeemanagementapi.services;

import com.AsgarGeorge.employeemanagementapi.entity.EmployeeEntity;
import com.AsgarGeorge.employeemanagementapi.model.Employee;
import com.AsgarGeorge.employeemanagementapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        List<Employee> employeesList = employeeEntityList
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getEmailId()
                        )).collect(Collectors.toList());
        return employeesList;
    }
}

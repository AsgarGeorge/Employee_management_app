package com.AsgarGeorge.employeemanagementapi.model;

import lombok.Data;

@Data
public class Employee {
    private Long Id;
    private String firstName;
    private String lastName;
    private String emailId;
}

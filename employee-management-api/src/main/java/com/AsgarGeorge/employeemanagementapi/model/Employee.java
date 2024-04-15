package com.AsgarGeorge.employeemanagementapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long Id;
    private String firstName;
    private String lastName;
    private String emailId;
}

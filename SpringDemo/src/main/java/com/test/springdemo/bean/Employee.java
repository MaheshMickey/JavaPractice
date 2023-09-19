package com.test.springdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int empId;
    private String empName;
    private String empAddress;
    private Department department;
        
    
    
}

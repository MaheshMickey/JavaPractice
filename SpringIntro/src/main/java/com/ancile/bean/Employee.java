package com.ancile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component("employeebean")
public class Employee {
	@Value("${empId}") // property placeholder data
	private int empId;
	@Value("${empName}")
	private String empName;
	@Value("${empAddress}")
	private String empAddress;
//	
//	@Autowired
//	@Qualifier("deptBean")
	@Value("#{deptBean}")
	private Department department;
	
}

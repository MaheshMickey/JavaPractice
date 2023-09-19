package com.ancile.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("deptBean")
public class Department {

	@Value("${depId}")
	private int depId;
	@Value("${depName}")
	private String depName;
}

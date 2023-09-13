package com.ancile.DemoJunit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderMethods {

	@Test
	@Order(2)
	public void method1() {
		System.out.println("Test 1");
	}
	
	@Test
	@Order(1)
	public void method2() {
		System.out.println("Test 2");
	}
	
	
}

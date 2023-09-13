package com.ancile.DemoJunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	Calculator c;
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all method");
	}
	
	@BeforeEach
	public void init() {
		 c= new Calculator();
		 System.out.println("before each test method");
	}
	
	@AfterEach
	public void endMethod() {
		System.out.println("Test has executed");
	}
	
	@org.junit.jupiter.api.Test
	@DisplayName("calulator")
    public void TestMethod1() {
    	System.out.println(c.add(12, 13));
    }
	
	@org.junit.jupiter.api.Test
	private void testMethod2() {
		System.out.println(c.add(-10,-20));
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all methid");
	}
	
}


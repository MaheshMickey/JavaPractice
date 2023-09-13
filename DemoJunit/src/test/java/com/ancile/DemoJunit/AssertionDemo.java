package com.ancile.DemoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionDemo {

	Calculator c;
	
	@BeforeEach
	public void init() {
		c= new Calculator();
		System.out.println("Before each");
	}
	
	@Test
	public void methodAssertEqual() {
		System.out.println(c.add(10, 20));
		Assertions.assertEquals(30, c.add(10, 20));
	}
	
	@Test
	public void methodAsserNotEqual() {
		System.out.println(c.add(10, 20));
		Assertions.assertNotEquals(49, c.add(10, 20));
	}
	
	@Test
	public void methodAssetArray() {
		System.out.println("Array Assert");
		Assertions.assertArrayEquals(new int[] {10,20}, new int[] {10,20});
	}
	
	@Test
	public void methodNull() {
		System.out.println("Null Assert");
		String name = null;
		Assertions.assertNull(name);
	}
}

package com.ancile.OOP;

public class DataTypesDemo {
	static int i=10;
	public void increment() {
		i++;
		System.out.println("i is:"+i);
	}
	
	//static block is executed faster than main block
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
//		byte-- 1byte
//		short-- 2bytes
//		int-- 4 bytes
//		long-- 8 bytes
//		float-- 4 bytes
//		double-- 8 bytes
		int a =10;
		long l = a;
		System.out.println(l);
		DataTypesDemo d = new DataTypesDemo();
		d.increment();
		
		DataTypesDemo d1 = new DataTypesDemo();
		d1.increment();
		//explicit type casting from small type to max type
		//which is also called as wide conversion
		
		long l1 = 100;
		int a1 = (int)l1;
		System.out.println("a1");
		//narrrow conversion or implicit typecasting
		
		
		
	}
}

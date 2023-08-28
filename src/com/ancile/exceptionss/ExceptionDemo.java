package com.ancile.exceptionss;

import java.util.*;
import java.io.*;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a =10;
			int b= 0;
			int c = a/b;
			
		}
		catch(Exception e) {
			System.out.println("Main Exception");
		}
		
		//once we write the main exception then we cant write sub exceptions 
//		}catch(ArithmeticException e) {
//			System.out.println("Divided by zero");
//		}
//		catch(Exception e) {
//			System.out.println("Main Exception");
//		}
		finally {
			System.out.println("finally block");
		}
		
		
		try {
			String name = null;
			System.out.println(name.length());
			
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}
//		finally {
//			System.out.println("Finally for Null");
//		}
		
		try {
			FileReader rf = new FileReader("one.txt");
			try {
				rf.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}

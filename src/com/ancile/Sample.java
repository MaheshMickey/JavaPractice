package com.ancile;

import java.util.Scanner;

class Test{
	void displayInfo() {
		System.out.println("Hey display info");
	}
}
public class Sample {
	public static void main(String args[]) {
		Test t =  new Test();
		t.displayInfo();
		System.out.println("From Sample class");
		Scanner scan =  new Scanner(System.in);
		String name = scan.nextLine();
		int i=0;
		
		if(name.equals("Mahesh")) {
			System.out.println("Entered input matches the pattern");
		}
		else {
			System.out.println("Wrong pattern found");
		}
		
		while(i<5) {
			System.out.println("I from while is "+i);
			i++;
		}
		
		System.out.println("Name is "+name+" with length"+name.length());
		for(int j=0;j<name.length();j++) {
			if(name.length()!=0) {
				System.out.println("Name is "+name+" with character at "+ j+" index is "+ name.charAt(j));
			}
		}
	}
}

package com.ancile.OOP;


class Test{
	
	//constructor Overloading
	Test(){
		
	}
	
	Test(String name){
		System.out.println(name);
		
	}
	
	Test(int number){
		System.out.println(number);
		
	}
	
	//method overloading
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(String name, String lname) {
		System.out.println(name+" "+lname);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
}
public class PolymorphsimDemo {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		Test t1 = new Test("Mahesh");
		Test t2 = new Test(1343);
		
		t.add(10.0, 10.0);
		t.add("Mahesh", "Mickey");
		t.add(120, 150);

	}

}

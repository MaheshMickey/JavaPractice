package com.ancile.OOP;

class Parent{
	public void showInfo() {
		System.out.println("Parent Class");
	}
	
	//we cant access a private method in another class, even it extends from parent
	protected void displayInfo() {
		System.out.println("Parent class display()");
	}
	
}

interface Parent1 {
	default void showInfo() {
		System.out.println("Parent 1 interface");
	}
	
	void KLO();
}

class Child extends Parent{
	
	//if we have a method defined in child class then it will not inherit
	//the same method from parent class
	public void showInfo() {
		System.out.println("Child class");
	}
	
	public void FGO() {
		System.out.println("Cild FGO");
	}
}

class Child1 extends Child implements Parent1{
	public void showInfo() {
		System.out.println("Child1 class");
	}
	
	public void KLO() {
		System.out.println("Implemente Method");
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.showInfo();
		c.displayInfo();
		
		Child1 c1 = new Child1();
		c1.showInfo();
		
		c1.KLO();
		//Polymorphic substitution
		//Parent class object to a child class ref 
		Parent p = new Child();
		p.showInfo();
		
		
		
		
		
	}
}

package com.ancile.OOP;

public class Objectdemo {
	public static void main(String[] args) {
		//Object creation or instance creation
		Student s = new Student();
		Student s1 = new Student(2,"Sandeep","India");
		s.setId(1);
		s.setStuName("Mickey");
		s.setAddr("USA");
//		System.out.println(s);
		//we can also use getters and setters of student to print
		System.out.println("Student id is:"+s.getId()+"\nStudent name is: "+s.getStuName()+"\nStudent Address is: "+s.getAddr());
		
		
		
		//returns the address of object created
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		
		//whenever object is created then constructor is called automatically
		Proffesor p = new Proffesor();
		System.out.println(p);
		
		Proffesor p1 = new Proffesor(113,"Charles","Maryville");
		System.out.println(p1);
	}
	
	

}

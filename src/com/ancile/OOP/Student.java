package com.ancile.OOP;

//(POJO) - plain old java object
public class Student {
	private int id;
	private String stuName;
	private String addr;
	
	public Student() {
	}
	public Student(int id, String stuName, String addr) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", addr=" + addr + "]";
	}
	
	
	
	

}

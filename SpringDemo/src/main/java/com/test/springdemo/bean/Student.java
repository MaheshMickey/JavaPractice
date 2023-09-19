package com.test.springdemo.bean;

public class Student {

	private int stuId;
	private String stuName;
	private String stuAddress;
	public Student(int stuId, String stuName, String stuAddress) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}
	
	
}

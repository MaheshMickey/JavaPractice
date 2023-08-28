package com.ancile.OOP;

public class Proffesor {

	private int profID;
	private String profName;
	private String profAddr;
	
	//directly we can also assign the values in constructor
	public Proffesor() {
		profID = 111;
		profName = "Hoot";
		profAddr = "Missouri";
	}

	//parameterized constructor 
	public Proffesor(int profID, String profName, String profAddr) {
		this.profID = profID;
		this.profName = profName;
		this.profAddr = profAddr;
	}
	public int getProfID() {
		return profID;
	}

	public void setProfID(int profID) {
		this.profID = profID;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getProfAddr() {
		return profAddr;
	}

	public void setProfAddr(String profAddr) {
		this.profAddr = profAddr;
	}

	@Override
	public String toString() {
		return "Proffesor [profID=" + profID + ", profName=" + profName + ", profAddr=" + profAddr + "]";
	}
	
	
}

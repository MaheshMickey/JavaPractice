package com.ancile.jpaassodemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int depId;
	private String depName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="depId")
	private List<Employee> listEmDp;

	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public List<Employee> getListEmDp() {
		return listEmDp;
	}
	public void setListEmDp(List<Employee> listEmDp) {
		this.listEmDp = listEmDp;
	}
	
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", listEmDp=" + listEmDp + "]";
	}
}

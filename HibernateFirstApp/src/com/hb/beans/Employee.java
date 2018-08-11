package com.hb.beans;

public class Employee {
	
	private int id;
	private String ename;
	private String esal;
	private String emarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getEmarks() {
		return emarks;
	}
	public void setEmarks(String emarks) {
		this.emarks = emarks;
	}
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esal=" + esal + ", emarks=" + emarks + ", getId()="
				+ getId() + ", getEname()=" + getEname() + ", getEsal()=" + getEsal() + ", getEmarks()=" + getEmarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	
	
	
	
	

}

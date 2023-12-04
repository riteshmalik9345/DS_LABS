package com.demo.beans;

public class Employee {
	private int empid;
	private String fullname;
	private String gender;
	public Employee(int empid, String fullname, String gender) {
		super();
		this.empid = empid;
		this.fullname = fullname;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullname=" + fullname + ", gender=" + gender + "]";
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}

package com.emple.demo;

public class Employee {
	private String name;
	private String city;
	private String dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String city, String dept) {
		super();
		this.name = name;
		this.city = city;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}

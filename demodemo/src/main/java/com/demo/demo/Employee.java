package com.demo.demo;

public class Employee {
	private String name;
	private String dept;
	private Address address;
	public Employee(String name, String dept, Address address) {
		super();
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
	public void demo() {
		System.out.println("Employee [name=" + name + ", dept=" + dept + ", address=" + address + "]");
	}
	
}

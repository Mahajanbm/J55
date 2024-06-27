package com.sbi.demo;

public class Employee {
	private int eId;
	private String eName;
	private float salary;
	private String dept;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, float salary, String dept, Address address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.dept = dept;
		this.address = address;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", dept=" + dept + ", address="
				+ address + "]";
	}
	
	

}

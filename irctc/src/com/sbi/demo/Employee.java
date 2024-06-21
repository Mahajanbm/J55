package com.sbi.demo;
public class Employee {
	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	static String country;
	static{

	}

	{
		System.out.println("Non-static block");
	}
	public Employee() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	static void data()
	{
		System.out.println("This is data method");
	}
	public static void main(String[] args) {

	}

}

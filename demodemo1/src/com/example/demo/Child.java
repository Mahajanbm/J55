package com.example.demo;


public abstract class Child implements I1,I2
{
	private int id ;
	private String name;
	private String city;
	private String deptString;
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDeptString() {
		return deptString;
	}
	public void setDeptString(String deptString) {
		this.deptString = deptString;
	}
	

}

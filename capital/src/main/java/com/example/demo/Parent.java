package com.example.demo;

public  class Parent {
	private String name;
	private String city;
	private String state;
	private String country;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}



	public	void logic()
	{

		System.out.println("It  is banking module");
	}
	public void display()
	{

		System.out.println("Display method");
	}



}

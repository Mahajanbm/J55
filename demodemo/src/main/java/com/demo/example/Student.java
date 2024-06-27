package com.demo.example;

public class Student {
	private int id;
	private String nameString;
	private String city;
	public Student(int id, String nameString, String city) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.city = city;
	}
	
	public void data() {
		System.out.println("Student [id=" + id + ", nameString=" + nameString + ", city=" + city + "]");
	}
	

}

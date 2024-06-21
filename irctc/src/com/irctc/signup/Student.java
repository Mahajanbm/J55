package com.irctc.signup;

public class Student {
	private int rollno;
	private String name;
	private String city;
	private String country;
	private int pincode;

	public void data(int rollno,String name,String city,String country,int pincode)
	{
		this.rollno=rollno;
		this.name=name;
		city=city;
		country=country;
		pincode=pincode;

	}

	public void display()
	{
		System.out.println(" roolno is: "+rollno);
		System.out.println("Name is : "+name);
		System.out.println("City is: "+city);
		System.out.println("country is : "+country);
		System.out.println("pincode is: "+pincode);

	}

}

package com.irctc.signup;

public class Product {
	private	int pid;
	private	String pName;
	private  float price;

	void data(int x,String y,float z)
	{
		pid=x;
		pName=y;
		price=z;
	}
	void display()
	{
		System.out.println(pid);
		System.out.println(pName);
		System.out.println(price);
	}
}

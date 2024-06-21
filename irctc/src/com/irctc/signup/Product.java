package com.irctc.signup;


public class Product {
	private	int pid;
	private	String pName;
	private  float price;
	private String validity;
	private String delivirydate;
	private String complain;

	public void  data(String x)
	{
		pName=x;
	}

	public void displayname() {
		System.out.println(pName);
	}
	public void  data(float x)
	{
		price=x;
	}

	public void displayprice() {
		System.out.println(price);
	}

	public void  data(int x)
	{
		pid=x;
	}
	public void data(int x,String nameString) {
		pid=x;
		pName=nameString;
	}
	public void dataidprice(int x,float y)
	{
		pid=x;
		price=y;
	}
	public void displayidprice()
	{
		System.out.println(pid);
		System.out.println(price);
	}
	public void displayidname()
	{
		System.out.println(pid);
		System.out.println(pName);
	}
	public void displyid()
	{
		System.out.println(pid);
	}
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

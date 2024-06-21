package com.irctc.signup;

public class Employee {
	private int id;
	private String name;
	public void dataid(int id)
	{
		this.id=id;
	}
	public void displayid()
	{
		System.out.println(id);
	}
	public void dataname(String name)
	{
		this.name=name;
	}
	public void displayname()
	{
		System.out.println(name);
	}

}

package com.inheritance.ex;

public class Parent {
	//int x=10;

	public Parent()
	{
		System.out.println("This is parent class constructor");
	}
	public Parent(int x)
	{
		this();
		System.out.println("This is parent class parameterized constructor");
	}
}

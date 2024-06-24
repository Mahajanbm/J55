package com.inheritance.ex;

public class Child   extends Parent{

	public Child() {
		super(10);
		System.out.println("This is child class constructor");
	}
	public Child(int x) {
		this();
		System.out.println("This is child class parameterized constructor");
	}

	
}

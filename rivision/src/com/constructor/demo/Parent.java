package com.constructor.demo;

public class Parent {

	public Parent() {
		System.out.println("This is parent class Default constructor");
	}
	public Parent(int x) {
		 this();
		System.out.println("This is parent class parameterized constructor");
	}
}

package com.example.demo;
public class Child {

	Parent parent;
	public Child(Parent parent) {
		super();
		this.parent = parent;
	}

	void demo()
	{
		parent.logic();
		parent.display();
	}



	public static void main(String[] args) {
		Child c1=new Child(new Parent());

		c1.demo();

	}
}

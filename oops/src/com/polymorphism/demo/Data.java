package com.polymorphism.demo;

public class Data {
	void demo()
	{
		System.out.println("hello I'm  from demo method");
	}
	void demo(int x)
	{

		System.out.println("hello I'm  from demo int method");

	}

	void demo( int x,int y)
	{

	}
	void demo( int x,float y)
	{

	}
	void demo(float x,int y)
	{

	}
	public static void main(String[] args) {
		Data d1=new Data();
		d1.demo();
		d1.demo(10);
	}

}

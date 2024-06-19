package com.irctc.registration;

public class Demo {
	{
		System.out.println("This is non-static block 0");
	}
	{
		System.out.println("This is non-static block 1 ");
	}
	{
		System.out.println("This is non-static block 2");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();//one object
		Demo d2=new Demo();//second object

		System.out.println("This is main method");
	}
}

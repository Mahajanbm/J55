package com.irctc.login;

public class TestDemo {

	public TestDemo() {

		System.out.println("This Test Demo");
	}
	void data()
	{
		System.out.println("This is data method");
	}

	static void  demo()
	{
		System.out.println("This demo method ");
	}
	 public static void main(String[] args) {
		TestDemo t1=new TestDemo();//it will call to constructor
		t1.data();
		TestDemo.demo();
	}
}

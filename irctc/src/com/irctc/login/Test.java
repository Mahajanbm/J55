package com.irctc.login;

public class Test {
	static
	{
		System.out.println("This is test class static block");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.x);
		System.out.println("Hello this is test class");
		System.out.println(Student.y);
	}
}

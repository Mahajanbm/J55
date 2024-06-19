package com.irctc.login;

import java.util.Scanner;

public class Test {
	static int id;
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		 Test.id=s1.nextInt();
		System.out.println("Enter Employee Name");
		String name=s1.next();
		System.out.println("Enter Employee City");
		String city=s1.next();
		System.out.println("Enter Employee Salary");
		float salary=s1.nextFloat();



		System.out.println("Employee Id is :  "+id);
	}
}

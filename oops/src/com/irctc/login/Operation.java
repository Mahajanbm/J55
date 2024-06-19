package com.irctc.login;

import java.util.Scanner;

public class Operation {
	int a;
	static int b;
	int result;
	static	Scanner s1=new Scanner(System.in);
	void add()
	{
		System.out.println("Enter 1St no");
		a=s1.nextInt();

		System.out.println("Enter 2nd no");
		Operation.b=s1.nextInt();
		result=a+b;
		System.out.println("Addition is "+result);
	}
	static	void sub()
	{Operation op=new Operation();
	System.out.println("Enter 1St no");
	op.a=s1.nextInt();

	System.out.println("Enter 2nd no");
	Operation.b=s1.nextInt();
	op.result=op.a+b;
	System.out.println("Addition is "+op.result);
	}
	void mul()
	{

	}
	static	void div()
	{

	}

}

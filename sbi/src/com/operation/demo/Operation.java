package com.operation.demo;

import java.util.Scanner;

public class Operation {



	public static void main(String[] args)
	{
		Operation op=new Operation();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First no");
		int x=s1.nextInt();
		System.out.println("Enter Second No");
		int y=s1.nextInt();

		int add=op.add(x, y);
		System.out.println("Addition is : "+add);



	}
	int add(int x,int y)
	{
		return x+y;
	}
}

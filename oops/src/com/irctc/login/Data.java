package com.irctc.login;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st No");
		int a=s1.nextInt();
		System.out.println("Enter 2nd No");
		int b=s1.nextInt();
		System.out.println("Enter 3rd No");
		int c=s1.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		
	}
}

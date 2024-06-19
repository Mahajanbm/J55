package com.irctc.login;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class Register {
	static int id;//access by using class name
	static String name;
	String city;//access by using object
	String panNo;
	static void data()
	{
		Register r1=new Register();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter User Id");
		Register.id=s1.nextInt();
		System.out.println("Enter  User Name");
		Register.name=s1.next();
		System.out.println("Enter user city");
		r1.city=s1.next();
		System.out.println("Enter user pan no");
		r1.panNo=s1.next();
		System.out.println("user Id is: "+Register.id);
	}


	public static void main(String[] args) {
		Register.data();
	}



}

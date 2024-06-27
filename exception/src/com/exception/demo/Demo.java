package com.exception.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		
		int[] a=new int[6];//
		try {
			String string=null;
			System.out.println(string.charAt(0));
			a[0]=10;
			a[1]=50;
			a[2]=70;
			a[3]=100;
			a[4]=500;
			a[5]=600;
			a[6]=700;
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			System.out.println(a[5]);
			System.out.println(a[6]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in code");
		}
	}
}

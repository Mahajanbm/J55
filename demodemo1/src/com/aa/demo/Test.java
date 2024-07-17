package com.aa.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int [] a= {0,30,60,40,80,90,100};//0-6=>7
		int [] b=new int[5];
		int[] d=new int[1000];
		b=d;
		int [][] c=new int[2][4];

		Scanner s1=new Scanner(System.in);
		int[] arr=new int[5];
		int x=arr.length;
		System.out.println("Array Operation");
		System.out.println("Enter Array Elements");
		for( int i=0;i<x;i++)
		{
			arr[i]=s1.nextInt();
		}
		System.out.println("Array Elements Are");
		for(int i=0;i<x;i++)
		{
			System.out.println(arr[i]);
		}


	}
}

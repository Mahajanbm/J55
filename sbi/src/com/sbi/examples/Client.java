package com.sbi.examples;

public class Client {
	public static void main(String[] args)
	{
		int i=7;
		System.out.println(i-- + ++i);//14
		System.out.println(--i + --i);//
		System.out.println(i++);//5
		System.out.println(i-- - ++i);//6
		System.out.println(++i);//6
		System.out.println(i++);//6
		System.out.println(--i);//6
		System.out.println(i--);//6
		System.out.println(i++);//5
		System.out.println(--i);//5
	}
}

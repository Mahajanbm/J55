package com.exception.demo;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.catalog.Catalog;

public class Test {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First no");
		try {
			int a=s1.nextInt();
			System.err.println("Enter Second Number");
			int b=s1.nextInt();
			int result=a/b;
			System.out.println("Division is: "+result);
		}

		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter proper Data");
		}

		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Second no should not be zero");
		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error in code");
		}

	}
}

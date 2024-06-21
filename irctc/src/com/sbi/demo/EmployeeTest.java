package com.sbi.demo;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeService e1=new EmployeeService();
		Scanner s1=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add Data");
			System.out.println("2.Display Data");
			System.out.println("Enter Your Choice");
			int ch=s1.nextInt();


			//e1.display();
			switch (ch) {
			case 1: {
				e1.getData();
				break;
			}
			case 2: {
				e1.display();
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}

	}
}

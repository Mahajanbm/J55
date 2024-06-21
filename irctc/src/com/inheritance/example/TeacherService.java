package com.inheritance.example;

import java.util.Scanner;

public class TeacherService {
	Teacher t1=new Teacher();
	void getData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Teacher First Name");
		String fnamde=s1.next();
		System.out.println("Enter Teacher  last NAme");
		String lname=s1.next();
		System.out.println("Enter Teacher  dept");
		String dept=s1.next();
		System.out.println("Enter Teacher  collegeName");
		String collgeName=s1.next();
		System.out.println("Enter Teacher City ");
		String city=s1.next();
		System.out.println("Enter Teacher Salary");
		float salary=s1.nextFloat();
		t1.setFirstName(fnamde);
		t1.setLastName(lname);
		t1.setCity(city);
		t1.setCollegname(lname);
		t1.setCity(dept);
		t1.setSalary(salary);
	}


	void display()
	{
		
		System.out.println("Teacher  First Name Is:  "+t1.getFirstName());
		System.out.println("Teacher  Last Name Is:  "+t1.getLastName());
		System.out.println("Teacher  city Is:  "+t1.getCity());
		System.out.println("Teacher  College Name Is:  "+t1.getCollegname());
		System.out.println("Teacher  Dept Is:  "+t1.getDept());
		System.out.println("Teacher  salary Is:  "+t1.getSalary());
	}

}

package com.sbi.registration;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Business b1=new Business();
		//	System.out.println(b1.id=50);	
		//System.out.println(b1.name="Joe");
		//System.out.println(b1.city="Hyd");
		//System.out.println(Business.dept="HR");
		Employee e1=new Employee();
		Org o1=new Org();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		Employee.id=s1.nextInt();
		System.out.println("Enter Employee Name");
		Employee.name=s1.next();
		System.out.println("Enter Employee city");
		e1.city=s1.next();
		System.out.println("Enter Employee dept");
		e1.dept=s1.next();
		System.out.println("Enter Employee salary");
		e1.salary=s1.nextFloat();
		System.out.println("Enter Org Name" );
		o1.orgname=s1.next();
		System.out.println("Enter Org Location" );
		Org.locationString=s1.next();
		System.out.println(" Employee Id Is: "+Employee.id);

		System.out.println(" Employee Name is : "+Employee.name);

		System.out.println(" Employee city is :"+e1.city);

		System.out.println(" Employee dept is : "+e1.dept);

		System.out.println(" Employee salary is : "+e1.salary);

		System.out.println(" Org Name is :"+Org.locationString );

		System.out.println(" Org Location is+ "+o1.orgname );















	}
}


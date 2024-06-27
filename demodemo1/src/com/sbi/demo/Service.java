package com.sbi.demo;

import java.util.Scanner;

public class Service {
	Address a1=new Address();
	Employee e1=new Employee();
	void setData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter Address");
		System.out.println("Enter Flat No");
		int flatno=s1.nextInt();
		System.out.println("Enter area");
		String area=s1.next();
		System.out.println("Enter city");
		String city=s1.next();
		System.out.println("Enter state");
		String state=s1.next();
		System.out.println("Enter country");
		String country=s1.next();
		System.out.println("Enter Pincode No");
		int pincode=s1.nextInt();
		System.out.println("Enter Employee Id");
		int id=s1.nextInt();
		System.out.println("Enter Employee Name");
		String name=s1.next();
		System.out.println("Enter Employee Salary");
		float salary=s1.nextFloat();
		System.out.println("Enter Employee Dept");
		String dept=s1.next();
		a1.setFlatno(flatno);
		a1.setArea(area);
		a1.setCity(city);
		a1.setState(state);
		a1.setCountry(country);
		a1.setPincode(pincode);

		e1.seteId(id);
		e1.seteName(name);
		e1.setSalary(salary);
		e1.setDept(dept);
		e1.setAddress(a1);		

	}

	void getData()
	{
		System.out.println(e1.geteId());
		System.out.println(e1.geteName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDept());
		System.out.println(e1.getAddress());
	}






}

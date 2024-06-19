package com.sbi.internatebanking;

public class Employee {

	int id=101;
	String pname="joe";
	static	float salary=45125;
	static	String dept="Hr";
	void data()
	{
		System.out.println(id);
		System.out.println(pname);
		System.out.println(Employee.salary);
		System.out.println(Employee.dept);
	}

	static void demo()
	{
		Employee e1=new Employee();
		System.out.println(e1.id);
		System.out.println(e1.pname);
		System.out.println(Employee.salary);
		System.out.println(Employee.dept);
	}
	public static void main(String [] args)
	{
		Employee e1=new Employee();
		e1.data();
		Employee.demo();
		

	}
}










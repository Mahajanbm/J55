package com.inheritance.example;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setFirstName("Mahajan");
		t1.setLastName("M");
		t1.setDept("IT");
		t1.setCollegname("ABC");
		t1.setCity("Hyd");
		t1.setSalary(12345);
		System.out.println("Teeacher FirstName is :" +t1.getFirstName());
	}
}

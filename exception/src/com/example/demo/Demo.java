package com.example.demo;

public class Demo {
	public static void main(String[] args) {
		try {
			String string="Hello";
			System.out.println(string.charAt(0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null pointer Exception");
		}
		finally {
			System.out.println("this is finally block");
		}

	}
}

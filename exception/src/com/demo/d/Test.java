package com.demo.d;

public class Test {
	public static void main(String[] args) {
		try {
			throw new Employee();
		} catch (Employee e) {
			// TODO: handle exception
			e.kaushal();
		}
	}
}

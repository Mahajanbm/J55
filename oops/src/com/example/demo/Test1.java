package com.example.demo;

public class Test1 {
	public static void main(String[] args) {
		Parent p1=new GrandChild();
		Child1 child1=new GrandChild();
		p1.data();
		child1.data();
	}
}

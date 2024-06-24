package com.data.data;



public class Test {
	public static void main(String[] args) {
		Data d1=Data.demo();
		Data d2=Data.demo();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}

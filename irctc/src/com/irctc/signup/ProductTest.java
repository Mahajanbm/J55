package com.irctc.signup;

public class ProductTest {
	public static void main(String[] args) {
		Product p1=new Product();
		//	System.out.println(p1.pid=10);
		//	System.out.println(p1.pName="mobile");
		//p1.data(10, "mobile");
		//	p1.data(101, "Tv", 12121);
		//p1.data(101, "cooler", 12121);
		p1.data(101, "cooler", 9000);
		p1.display();
	}
}

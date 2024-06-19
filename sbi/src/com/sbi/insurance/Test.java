package com.sbi.insurance;

public class Test {
	int x=50;

	void display()
	{
		Test t1=new Test();
		int x=10;
		System.out.println(x);
		System.out.println(t1.x);
		

	}
	int data()
	{

		return 10;
	}
	public static void main(String[] args) {

		Test t1=new Test();
		int x=	t1.data();
		System.out.println(x);
		t1.display();



	}

}

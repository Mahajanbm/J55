package com.data.data;

public class Data {
	static	Data d1=new Data();
	private Data()
	{
		System.out.println("This  is constructor");
	}
	static Data demo()
	{
		return d1;

	}

}

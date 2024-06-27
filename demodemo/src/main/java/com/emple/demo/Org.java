package com.emple.demo;

import java.util.List;

public class Org {
	private String name;
	private List<String> emps;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Org(String name, List<String> emps) {
		super();
		this.name = name;
		this.emps = emps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getEmps() {
		return emps;
	}
	public void setEmps(List<String> emps) {
		this.emps = emps;
	}
	public void data()
	 {
		 System.out.println("Name "+name);
		 System.out.println("Employeess" );
		 for (String employee : emps) {
			System.out.println(employee);
		}
	 }


}

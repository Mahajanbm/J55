package com.hibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.manytoone.Dept;
import com.hibernate.manytoone.Employee;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory=
				Persistence.createEntityManagerFactory("M");
		EntityManager  eManager=eManagerFactory.createEntityManager();
		eManager.getTransaction().begin();
		Dept d1=new Dept();
		d1.setName("IT");
		eManager.persist(d1);
		Employee e1=new Employee();
		e1.setName("Joe");
		e1.setCity("Hyd");
		e1.setSalary(12345);
		e1.setDept(d1);
		Employee e2=new Employee();
		e2.setName("Bob");
		e2.setCity("pune");
		e2.setSalary(8787);
		e2.setDept(d1);
		Employee e3=new Employee();
		e3.setName("mahi");
		e3.setCity("mumbai");
		e3.setSalary(9632);
		e3.setDept(d1);
		eManager.persist(e1);
		eManager.persist(e2);
		eManager.persist(e3);
		eManager.getTransaction().commit();
		eManager.close();
		eManagerFactory.close();



		System.out.println("Hello");






	}
}

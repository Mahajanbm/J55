package com.hibernate.test;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.demo.Subject;
import com.hibernate.demo.Teacher;



public class TestDemo {
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("M");
		EntityManager eManager=eManagerFactory.createEntityManager();
		eManager.getTransaction().begin();
		Subject s1=new Subject();
		s1.setName("Java");
		Subject s2=new Subject();
		s2.setName("C");
		Subject s3=new Subject();
		s3.setName("C#");
		Subject s4=new Subject();
		s4.setName("Python");
		
		
		
		
		
		
		
		
		
		
		
		Set<Subject> mmSet=new TreeSet<>();
		mmSet.add(s1);
		mmSet.add(s2);
		mmSet.add(s3);
		mmSet.add(s4);
		mmSet.add(s4);
		Teacher t1=new Teacher();
		t1.setName("MAhajan");
		t1.setCity("Hyd");
		t1.setSalary(8885);
		t1.setSubjects(mmSet);

		Teacher t2=new Teacher();
		t2.setName("Bob");
		t2.setCity("Mumbai");
		t2.setSalary(54122);
		t2.setSubjects(mmSet);
		Teacher t3=new Teacher();
		t3.setName("Tim");
		t3.setCity("pune");
		t3.setSalary(12345);
		t3.setSubjects(mmSet);

		s1.getTeachers().add(t1);
		t1.getSubjects().add(s1);
		
		eManager.persist(t1);
		eManager.persist(t2);
		eManager.persist(t3);	
		eManager.persist(s1);
		eManager.persist(s2);
		eManager.persist(s3);
		eManager.persist(s4);
		eManager.getTransaction().commit();
		eManager.close();
		eManagerFactory.close();
		System.out.println("many to many");








	}
}

package com.hibernate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.demo.Employee;

public class TEstDemo1 {
	public static void main(String[] args) {

		EntityManagerFactory eManagerFactory = Persistence.createEntityManagerFactory("M");
		EntityManager eManager = eManagerFactory.createEntityManager();

		eManager.getTransaction().begin(); 
		/*Employee e1=new Employee();
		e1.setName("Mahajan"); e1.setSalary(12555); e1.setCity("Pune"); Employee
		e2=new Employee(); e2.setName("sunil"); e2.setSalary(7415);
		e2.setCity("mumbai"); Employee e3=new Employee(); e3.setName("bob");
		e3.setSalary(74126); e3.setCity("Hyd"); Employee e4=new Employee();
		e4.setName("sarthak"); e4.setSalary(985); e4.setCity("Pune");

		eManager.persist(e1); eManager.persist(e2); eManager.persist(e3);
		eManager.persist(e4);


		*/
		Query q1 = eManager.createQuery(" Select e from Employee e");

		List<Employee> l1 = q1.getResultList();

		for (Employee employee : l1) {
			System.out.println(employee.getId() + "   " +
					employee.getName() + " " + employee.getCity() + "  "+employee.getSalary());
		}

		eManager.getTransaction().commit();
		eManager.close();
		eManagerFactory.close();

		System.out.println("Hellos");

	}

}

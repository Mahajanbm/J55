package com.demo.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.demo.Employee;

public class TestDemo {
	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Employee employee=(Employee) applicationContext.getBean("mm");
		// employee.data();
		BeanFactory bFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		com.demo.demo.Employee p1 = (Employee) bFactory.getBean("emp");
		p1.demo();
	}
}

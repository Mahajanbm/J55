package com.example.demo.entity;

import java.util.Set;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import ch.qos.logback.core.util.AggregationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dept;
	@ManyToMany(targetEntity = Teacher.class)
	private Set teachers;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String name, String dept, Set teachers) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.teachers = teachers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Set getTeachers() {
		return teachers;
	}
	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}



}

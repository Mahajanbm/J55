package com.hibernate.demo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//@Entity
public class Subject implements Comparable<Subject> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany(targetEntity = Teacher.class)
	private Set<Teacher> teachers;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public int compareTo(Subject o) {
		if(id>o.id)
		{
			return 1;
		}
		if(id<o.id)
		{
			return -1;
		}
		else {

			return 0;
		}
	}
}





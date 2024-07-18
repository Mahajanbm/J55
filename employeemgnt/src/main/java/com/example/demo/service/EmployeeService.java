package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee addData(Employee employee);
	List<Employee> fetchEmployees();
	Employee updateDEmployee(Employee employee);
	void delete(int id);
}

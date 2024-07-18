package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/Home")
public class EmployeeController {
	EmployeeServiceImpl employeeServiceImpl;

	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
		super();
		this.employeeServiceImpl = employeeServiceImpl;
	}
	@GetMapping("/data")
	public ResponseEntity<List<Employee>> data()
	{
		List<Employee> l1=employeeServiceImpl.fetchEmployees();
		return new ResponseEntity<>(l1,HttpStatus.OK);

	}
	@PostMapping("/save")
	public ResponseEntity<Employee> dataadd(@RequestBody Employee employee)
	{
		Employee e1=employeeServiceImpl.addData(employee);
		return new ResponseEntity<>(e1,HttpStatus.OK);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> detEntity(@PathVariable ("id") int id)

	{
		employeeServiceImpl.delete(id);
		return new ResponseEntity<>("data deleted sucessfull",HttpStatus.OK);
	}

}

package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRespository;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRespository employeeRespository;
	public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}

	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee addData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRespository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployees() {
		// TODO Auto-generated method stub
		return employeeRespository.findAll();
	}

	@Override
	public Employee updateDEmployee(Employee employee) {
		Employee  e1=employeeRespository.findById(employee.getId()).get();
		e1.setName(employee.getName());
		e1.setCity(employee.getCity());
		e1.setDept(employee.getDept());
		e1.setSalary(employee.getSalary());
		return employeeRespository.save(e1);
	}

	@Override
	public void delete(int id) {
		employeeRespository.deleteById(id);

	}

}

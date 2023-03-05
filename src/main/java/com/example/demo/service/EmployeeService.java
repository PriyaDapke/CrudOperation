package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getEmployeeList();
	
	public Employee updateEmployee(Employee employee,int id);
	
	public void deleteEmployee(int id);

}

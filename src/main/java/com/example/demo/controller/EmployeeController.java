package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();
	}
	
	@PutMapping("/put")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id")int id) {
		return employeeService.updateEmployee(employee, id);
	}
	@DeleteMapping("/delete{id}")
	public String deleteEmployeeById(@PathVariable("id")int id) {
		employeeService.deleteEmployee(id);
		return "Deleted Successfully";
	}
	

}

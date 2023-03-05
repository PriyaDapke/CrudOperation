package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		
		Employee db=employeeRepository.findById(id).get();
		
		if(Objects.nonNull(employee.getFirstName())&& !"".equalsIgnoreCase(
				employee.getFirstName())) {
			db.setFirstName(employee.getFirstName());
		}
		if(Objects.nonNull(employee.getLastName())&& !"".equalsIgnoreCase(
				employee.getLastName())) {
			db.setFirstName(employee.getLastName());
		}
		
		if(Objects.nonNull(employee.getEmail())&& !"".equalsIgnoreCase(
				employee.getEmail())) {
			db.setFirstName(employee.getEmail());
		}
		return employeeRepository.save(db);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}

}

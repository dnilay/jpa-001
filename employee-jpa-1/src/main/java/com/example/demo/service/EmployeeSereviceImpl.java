package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
@Service
public class EmployeeSereviceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeSereviceImpl(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}

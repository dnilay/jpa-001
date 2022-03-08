package org.example.demo.service;

import java.util.List;

import org.example.demo.model.Employee;
import org.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private  EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public List<Employee> fetchemployees() {
		// TODO Auto-generated method stub
		return employeeRepository.fetchemployees();
	}

}

package org.example.demo.service;

import java.util.List;

import org.example.demo.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee);
	public List<Employee> fetchemployees();
}

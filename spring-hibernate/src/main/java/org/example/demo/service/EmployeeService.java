package org.example.demo.service;

import java.util.List;

import org.example.demo.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee);
	public List<Employee> fetchemployees();
	public Employee findEmployeeById(int employeeId);
	public Employee updateEmployee(int employeeId,Employee employee);
	public void deleteEmployee(int employeeId);
}

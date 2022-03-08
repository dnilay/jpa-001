package org.example.demo.repo;

import java.util.List;

import org.example.demo.model.Employee;

public interface EmployeeRepository {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> fetchemployees();
	
	public Employee findEmployeeById(int employeeId);
	public Employee updateEmployee(int employeeId,Employee employee);
	public void deleteEmployee(int employeeId);

}

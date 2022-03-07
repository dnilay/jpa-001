package org.example.employee_app.repo;

import java.util.List;

import org.example.employee_app.model.Employee;

public interface EmployeeReporitory {
	
	public Employee createEmployee(Employee employee);
	
	public List<Employee> fetchEmployees();
	

}

package org.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "employee_name",nullable = false)
	private String employeeName;
	@Column(name = "salary",nullable = false)
	private double salary;
	public Employee() {
		
	}
	
	
	public Employee(String employeeName, double salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}


	public Employee(int employeeId, String employeeName, double salary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	

}

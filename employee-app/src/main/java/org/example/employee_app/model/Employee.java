package org.example.employee_app.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -276680477988863950L;
	
	private int employeeId;
	private String employeeName;
	private double salary;
	public Employee() {
		
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	

}

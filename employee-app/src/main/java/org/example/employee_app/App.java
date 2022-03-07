package org.example.employee_app;

import java.lang.System.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.example.employee_app.model.Employee;
import org.example.employee_app.repo.EmployeeReporitory;
import org.example.employee_app.repo.EmployeeRepositoryImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	try {
    		EmployeeReporitory employeeReporitory=new EmployeeRepositoryImpl();
			/*
			 * Employee employee=new Employee(100, "Marry", 45000);
			 * System.out.println(employeeReporitory.createEmployee(employee));
			 */
    		List<Employee> employees=employeeReporitory.fetchEmployees();
    		Iterator<Employee> iterator=employees.iterator();
    		while(iterator.hasNext())
    		{
    			System.out.println(iterator.next());
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
      
      
    }
}

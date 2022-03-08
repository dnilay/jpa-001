package org.example.demo;

import java.util.List;

import org.example.demo.config.SpringConfig;
import org.example.demo.model.Employee;
import org.example.demo.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			Employee employee = new Employee(101, "demo-emp-1", 10000);
			EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeService.class);
			//System.out.println(employeeService.createEmployee(employee));
			List<Employee> list=employeeService.fetchemployees();
			System.out.println(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

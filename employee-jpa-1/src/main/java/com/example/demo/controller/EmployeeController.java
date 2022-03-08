package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/")
	public String getEmployees(Model theModel)
	{
		List<Employee> list=employeeService.getAllEmployees();
		System.out.println(list);
		theModel.addAttribute("employees",list);
		return "index";
	}
	

}

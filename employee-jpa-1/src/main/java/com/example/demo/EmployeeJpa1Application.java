package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@SpringBootApplication
public class EmployeeJpa1Application implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeJpa1Application(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee(100, "A", "AA", 1000));
		employeeRepository.save(new Employee(101, "B", "BB", 1001));
		employeeRepository.save(new Employee(102, "C", "CC", 1002));

	}

}

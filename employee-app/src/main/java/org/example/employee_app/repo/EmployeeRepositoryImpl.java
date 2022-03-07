package org.example.employee_app.repo;

import java.util.List;

import org.example.employee_app.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeRepositoryImpl implements EmployeeReporitory {

	private final SessionFactory sessionFactory;
	private final Session session;

	public EmployeeRepositoryImpl() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	@Override
	public List<Employee> fetchEmployees() {
		session.getTransaction().begin();
		Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
		List<Employee> list = query.getResultList();
		session.getTransaction().commit();
		return list;
	}

}

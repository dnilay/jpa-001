package org.example.demo.repo;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private final SessionFactory sessionFactory;

	@Autowired
	public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override

	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	@Override

	public List<Employee> fetchemployees() {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		TypedQuery<Employee> query=session.createQuery("FROM Employee",Employee.class);
		return query.getResultList();
	}

}

package org.example.employee_app;

import java.util.Random;

import org.example.employee_app.model.Employee;
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
      SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
      Session session=sessionFactory.openSession();
      Employee employee=new Employee(new Random().nextInt(1000), "John Doe", 20000.0);
      session.getTransaction().begin();
      session.save(employee);
      session.getTransaction().commit();
      System.out.println("inserted");
      System.out.println(session);
    }
}

package com.tests;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestSeterUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		BigDecimal money = new BigDecimal("1000000");
		
		try {

			Employee employee;
			
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			employee = session.get(Employee.class, (long) 3);
			employee.setName("Akkela");
			employee.setSurname("Black");
			employee.setSalary(money);
			
			session.getTransaction().commit();
			
		} finally {
			sessionFactory.close();
		}

	}

}

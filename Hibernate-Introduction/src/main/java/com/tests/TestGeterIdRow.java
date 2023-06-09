package com.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestGeterIdRow {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		try {

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Employee employee = session.get(Employee.class, (long) 2);
			session.getTransaction().commit();

			System.out.println(employee);

		} finally {
			sessionFactory.close();
		}
	}

}

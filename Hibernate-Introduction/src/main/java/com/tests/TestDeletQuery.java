package com.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestDeletQuery {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		try {

			Session session = factory.getCurrentSession();

			try {
				session.getTransaction().begin();

				session.createQuery("delete Employee where name = 'Aleksandr'").executeUpdate();

				session.getTransaction().commit();
			} finally {
				session.close();
			}

		} finally {
			factory.close();
		}
	}

}

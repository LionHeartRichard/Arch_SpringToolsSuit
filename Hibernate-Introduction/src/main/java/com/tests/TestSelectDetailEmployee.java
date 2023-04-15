package com.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Detail;
import com.model.Employee;

public class TestSelectDetailEmployee {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class).buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();

			try {

				session.getTransaction().begin();
				Employee employee = session.get(Employee.class, (long) 2);
				session.getTransaction().commit();

				System.out.println(employee);

			} finally {
				session.close();
			}

		} finally {
			factory.close();
		}
	}

}

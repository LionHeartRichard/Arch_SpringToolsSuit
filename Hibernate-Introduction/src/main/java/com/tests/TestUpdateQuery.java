package com.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestUpdateQuery {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			
			session.getTransaction().begin();
			
			
			session.createQuery("update Employee set salary = 800 where name = 'Aleksandr'").executeUpdate();			
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}

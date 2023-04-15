package com.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class TestSelectAllRowsTable {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		try {
			
			Session session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			
			list = session.createQuery("from Employee").getResultList();
			
						
			session.getTransaction().commit();
			System.out.println("_______________Done!!!____________");
			
			
			for (Employee l:list) {
				System.out.println(l);
			}

		} finally {
			sessionFactory.close();
		}
	}
}

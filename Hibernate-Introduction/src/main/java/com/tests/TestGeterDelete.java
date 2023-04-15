package com.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Detail;
import com.model.Employee;

public class TestGeterDelete {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class).buildSessionFactory();

		try {

			Session session = factory.getCurrentSession();
			try {
				session.getTransaction().begin();

				Detail detail = session.get(Detail.class, (long) 5);
				
				Employee employee = detail.getEmployeeId();
				employee.setDetailId(null);
				
				session.delete(detail);
			} finally {
				session.getTransaction().commit();
			}

		} finally {
			factory.close();
		}
	}
}

package com.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Detail;
import com.model.Employee;

public class TestListSelectWhere {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class).buildSessionFactory();

		try {

			Session session = sessionFactory.getCurrentSession();

			try {

				session.beginTransaction();

				list = session.createQuery("from Employee where salary<1000").getResultList();
			} finally {
				session.close();
			}

			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

		for (Employee l : list) {
			System.out.println(l);
		}

	}

}

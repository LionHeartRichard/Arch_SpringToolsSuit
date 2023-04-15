package com.tests;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Detail;
import com.model.Employee;

public class TestInsertInto {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class).buildSessionFactory();

		BigDecimal money = new BigDecimal(45000);

		Employee employe = new Employee("Felix", "Gruver", money);

		Detail detail = new Detail("Los Angeles", "9999-888-77-654", "felix@gmail");

		employe.setDetailId(detail);

		try {

			Session session = factory.getCurrentSession();
			try {
				session.getTransaction().begin();

				session.save(employe);

				session.getTransaction().commit();
				
			} finally {
				session.close();
			}

		} finally {
			factory.close();
		}
	}
}

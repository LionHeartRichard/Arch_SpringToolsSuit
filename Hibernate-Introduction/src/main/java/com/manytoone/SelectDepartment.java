package com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;
import com.model.Detail;
import com.model.Employee;

public class SelectDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Department.class)
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

		Department department;

		try {
			Session session = factory.getCurrentSession();
			try {

				session.getTransaction().begin();

				department = session.get(Department.class, "IT");

				session.getTransaction().commit();

			} finally {
				session.close();
			}

		} finally {
			factory.close();
		}

		System.out.println(department);

	}

}

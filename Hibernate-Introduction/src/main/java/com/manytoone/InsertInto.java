package com.manytoone;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;
import com.model.Detail;
import com.model.Employee;

public class InsertInto {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Department.class)
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

		BigDecimal minMoney = new BigDecimal(800);
		BigDecimal maxMoney = new BigDecimal(1200);

		Department department = new Department("HR", minMoney, maxMoney);
		Employee employe = new Employee("Elena", "Mihailova", minMoney);
		Employee employeeNew = new Employee("Olga", "Marieeva", maxMoney);

		department.addEmployee(employe);
		department.addEmployee(employeeNew);

		try {
			Session session = factory.getCurrentSession();
			try {

				session.getTransaction().begin();

				session.save(department);

				session.getTransaction().commit();

			} finally {
				session.close();
			}
		} finally {
			factory.close();
		}

	}

}

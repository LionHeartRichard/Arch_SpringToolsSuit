package com.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.model.Child;
import com.manytomany.model.Section;

public class Testing {
	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Section.class)
				.addAnnotatedClass(Child.class).buildSessionFactory();
		
		Child chTimur = new Child("Timur");
		
		Section section1 = new Section("Dance");
		Section section2 = new Section("Atlitics");
		Section section3 = new Section("Boxing");
		
		chTimur.addSection(section1);
		chTimur.addSection(section2);
		chTimur.addSection(section3);
		
		
		try {
			Session session = factory.getCurrentSession();
			try {
				session.getTransaction().begin();

				session.persist(chTimur);

				session.getTransaction().commit();
			} finally {
				session.close();
			}
		} finally {
			factory.close();
		}
	}

}

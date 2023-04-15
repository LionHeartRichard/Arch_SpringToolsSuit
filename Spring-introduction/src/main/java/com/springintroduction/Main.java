package com.springintroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.singleton.Animals;
import com.singleton.Jaguar;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Animals animals = context.getBean("animals", Animals.class);
		animals.action();
		animals.printCount();
						
		Jaguar jaguar = context.getBean("jaguar", Jaguar.class);
		jaguar.action();
		jaguar.roar();
		
		Jaguar jaguar2 = context.getBean("jaguar", Jaguar.class);
		jaguar2.roar();
	
		
		jaguar.printCount();
		
		animals.printCount();
		
		context.close();
	}

}

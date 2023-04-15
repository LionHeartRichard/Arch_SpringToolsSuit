package com.example.annotapring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyExampleAnnotationSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyExampleAnnotationSpringApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cat myCat = context.getBean("catBean", Cat.class);
		myCat.say();
		
		context.close();
	}

}

package com.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.core")
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		DataBaseBank dbBank = context.getBean("dataBaseBank", DataBaseBank.class);
		
		System.out.println(dbBank.getCountConnection());
		
		
		context.close();
		
	}

}

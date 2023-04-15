package com.join.point;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.join.point")
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		
		UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
		Book book = context.getBean("book", Book.class);
		
		
		uniLibrary.addBook("Petenkin", book);
		
		context.close();
	}
}

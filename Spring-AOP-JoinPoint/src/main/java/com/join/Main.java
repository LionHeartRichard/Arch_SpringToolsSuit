package com.join;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.join.singleton.Book;
import com.join.singleton.Library;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);

		Library library = context.getBean("library", Library.class);
		Book book = context.getBean("book", Book.class);
		
		library.addBook("Person-test", book);
		System.out.println("bean - counter = " + Library.getCounter());
		
		library.getBook();

		context.close();
	
	}

}

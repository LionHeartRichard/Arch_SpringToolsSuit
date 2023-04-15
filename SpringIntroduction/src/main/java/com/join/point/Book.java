package com.join.point;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	public Book() {
		System.out.println("----------------BEAN----BOOOOOOOKKKK");
	}
	
	@Value("Преступление и наказание")
	private String name;
	
	@Value("1866")
	private int yearOfPublication;

	@Value("Ф.М. Достоевский")
	private String author;
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
}

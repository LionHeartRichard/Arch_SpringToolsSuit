package com.join.singleton;

import org.springframework.stereotype.Component;

@Component
public class Library {
	
	private static int counter; 
	
	private Library() {
		System.out.println("!!!bean library is CREATED!!!");
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public void getBook() {
		System.out.println("---Method --- getBook");
	}
	
	public void addBook(String personName, Book book) {
		System.out.println("---addddddddddddBooooooooooook_______");
	}
	
	public void addMagazin() {
		System.out.println("-MAGAZIN-");
	}
}

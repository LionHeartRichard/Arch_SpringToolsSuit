package com.join.point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
	
	public UniLibrary() {
		System.out.println("-----------BEAN-----UNI_LIB-RA-RY!!!");
	}

	public void addBook(String personName, Book book) {
		System.out.println("--Add BOOK in UniLibrary");
	}
	
	public void addMagazine() {
		System.out.println("--Add BOOK in UniLibrary");
	}
	
}

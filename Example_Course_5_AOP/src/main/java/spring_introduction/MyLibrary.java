package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyLibrary {
	
	@Autowired
	private Book book;
	
	public MyLibrary() {
		System.out.println("++&&&Bean MYLIBRARY is created&&&++");
	}

	
	public void getBook(){
		System.out.println("Вы получили книгу");
	}
	
	public void addBook(Book book) {
		System.out.println("Добавилась книга в БИБЛИОТЕКУ");
	}
	public void addMagazin() {
		System.out.println("Добавилася ЖУРНАЛ в БИБЛИОТЕКУ");
	}
}

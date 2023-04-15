package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Book {
	
	public int count=0;
	
	public Book() {
		this.count++;
		System.out.println("--!!!Bean BOOK is created!!!--");
	}
	
	@Value("Преступление и наказание")
	private String name;
	
	@Value("Ф.М. Достоевский")
	private String author;
	
	@Value("1866")
	private int yaer;
	
	
	public String getName() {
		return name;
	}
	
	
	public String getAuthor() {
		return author;
	}
	

	public int getYaer() {
		return yaer;
	}
	
}

package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {
	
	public UniversityLibrary() {
		System.out.println("################_______Bean__is__CREATED_________###########");
	}
	
	public void getBook() {
		System.out.println("Вы получили книгу");
	}
}

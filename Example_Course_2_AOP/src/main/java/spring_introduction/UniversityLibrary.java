package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends GlobalLibrary {
	
	UniversityLibrary(){
		System.out.println("--------bean universityLibrary-----is created-----");
	}

	private String nameUniversity;
	
	@Override
	public void getBook() {
		System.out.println("  getBook from UNIVERSITY");
	}

	@Override
	public String returnBook() {
		System.out.println("  ok, book returned in library UNIVERSITY");
		return "ok, book returned in library UNIVERSITY";
	}
	
	public void setNameUniversity(String nameUniversity) {
		this.nameUniversity = nameUniversity;
	}

	public String getNameUniversity() {
		return nameUniversity;
	}
	
	@Autowired
	public void getBook(Book book) {
		System.out.println("Вы взяли книгу " + book.getName());
	}
	

}

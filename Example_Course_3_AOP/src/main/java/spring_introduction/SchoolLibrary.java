package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends Library {

	@Override
	public void getBook() {
		System.out.println("getBook SchoolLibrary");
	}

	@Override
	public void returnBook() {
		System.out.println("--returnBOOK schoolLibrary");
		
	}

	@Override
	public void getMagazine() {
		System.out.println("getMagazine SchoolLibrary");	
	}

	@Override
	public void addBook() {
		System.out.println("++ADD SchoolLibrary");
		
	}

	@Override
	public void addMagazin() {
		System.out.println("++ADD SchoolLibrary");
		
	}

}

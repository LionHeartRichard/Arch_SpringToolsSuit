package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends Library {

	@Override
	public void getBook() {
		System.out.println("   getBook University");		
	}

	@Override
	public void returnBook() {
		System.out.println("return University BOOK");
		
	}

	@Override
	public void getMagazine() {
		System.out.println("   getMagazine University");
		
	}

	@Override
	public void addBook() {
		System.out.println("   +++ADD University");
		
	}

	@Override
	public void addMagazin() {
		System.out.println("   +++ADD University");
		
	}

}

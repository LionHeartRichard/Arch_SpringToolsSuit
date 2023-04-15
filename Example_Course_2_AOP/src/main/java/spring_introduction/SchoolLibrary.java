package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends GlobalLibrary {
	
	
	
	private long idLibrary;
	
	@Override
	public void getBook() {
		System.out.println("  getBook from SchoolLibrary");
	}

	@Override
	public String returnBook() {
		System.out.println("  ok, book returned in library SchoolLibrary");
		return "ok, book returned in library SchoolLibrary";
	}

	public long getIdLibrary() {
		return idLibrary;
	}

	public void setIdLibrary(long idLibrary) {
		this.idLibrary = idLibrary;
	}

}

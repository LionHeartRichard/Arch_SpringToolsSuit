package spring_introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExampleCourse3AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleCourse3AopApplication.class, args);
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigSpring.class);
		
		UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
		universityLibrary.getBook();
		universityLibrary.getMagazine();
		
		SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
		schoolLibrary.getBook();
		schoolLibrary.getMagazine();
		
		
		universityLibrary.returnBook();
		schoolLibrary.returnBook();
		
		universityLibrary.addBook();
		universityLibrary.addMagazin();
		schoolLibrary.addBook();
		schoolLibrary.addMagazin();
		context.close();
	}

}

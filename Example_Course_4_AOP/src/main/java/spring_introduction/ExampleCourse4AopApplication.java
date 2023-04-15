package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleCourse4AopApplication {

	public static void main(String[] args) {
				
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigSpring.class);
		
		UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
		universityLibrary.getBook();
		
		context.close();
	}

}

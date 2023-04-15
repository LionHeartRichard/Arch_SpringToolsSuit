package spring_introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExampleCourse11Application {

	public static void main(String[] args) {
		SpringApplication.run(ExampleCourse11Application.class, args);
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfigSpring.class);
		
		Person person = context.getBean("person", Person.class);
		person.callYourPet();
		
		context.close();
	}

}

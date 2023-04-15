package spring_introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExampleCourse12Application {

	public static void main(String[] args) {
		SpringApplication.run(ExampleCourse12Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigSpring.class);

		Person person = context.getBean("personBean", Person.class);
		
		person.callYourPet();
		
		System.out.print(person.getName());
		System.out.print(" " + person.getAge());
		
		context.close();
	}

}

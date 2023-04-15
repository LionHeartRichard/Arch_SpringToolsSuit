package spring_introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExampleCourse1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExampleCourse1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNew.xml");
		
		Animals animals = context.getBean("animals", Animals.class);
		animals.action();
		
		Jaguar jaguar = context.getBean("jaguar", Jaguar.class);
		Jaguar jaguar2 = context.getBean("jaguar", Jaguar.class); 
		
		System.out.println(" Переменные JAGUAR равны?!: " + jaguar.equals(jaguar2));
		
		Leon leon = context.getBean("leon", Leon.class);
		Leon leon2 = context.getBean("leon", Leon.class);
		
		System.out.println("переменные Leon равны?!: " + leon.equals(leon2));
		
		
		jaguar.printCount();
		
		context.close();
	}

}

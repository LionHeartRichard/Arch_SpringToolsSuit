package spring_introduction.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogingAdvice {

	@Before("execution(* spring_introduction.*.add*(..))")
	public void logingAllAddMethod() {
		System.out.println("___________________________________________");
		System.out.println("-------------------------------------------");
	}
}

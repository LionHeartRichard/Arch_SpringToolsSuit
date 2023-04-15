package spring_introduction.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LogingAspects {
	@Before("spring_introduction.aspects.MyPointcuts.allGetPointcut()")
	public void logingGetBookAdvice() {
		System.out.println("    ЛОГИРОВАНИЕ - попытка получить книгу");
	}
}

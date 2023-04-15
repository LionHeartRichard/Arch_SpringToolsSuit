package spring_introduction.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAspect {
	
	@Before("execution(public void getBook())")
	public void getBookAdvice() {
		System.out.println("hard coded POINTCUT - before aspect - getBook");
	}
	
	@Before("execution(public String return*())")
	public void returnAdvice() {
		System.out.println("  return *** pointcat ***");
	}
	
	@Before("execution(public void set*(String))")
	public void setAdvice() {
		System.out.println(" set(String)");
	}
	
	@Before("execution(public void getBook(spring_introduction.Book))")
	public void getBookWhithParametr() {
		System.out.println("    ---- method ----whith --- parametr=Book");		
	}
	
}

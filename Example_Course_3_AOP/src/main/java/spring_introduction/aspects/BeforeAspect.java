package spring_introduction.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAspect {

	@Pointcut("execution(public void get*())")
	private void getPointcutPublicVoid() {}
	
	@Pointcut("execution(public void return*())")
	private void returnPointcutPublicVoid() {}
	
	@Pointcut("getPointcutPublicVoid() || returnPointcutPublicVoid()")
	public void returnAndGet() {}
	

	@Pointcut("execution(* spring_introduction.UniversityLibrary.*(..))")
	private void allClassPoint() {}
	
	//------------------------Before------------------------
	
	
	@Before("getPointcutPublicVoid()")
	private void logingAdvice() {
		System.out.println("   Validate user - loging");
	}
	
	
	@Before("returnAndGet()")
	public void securityAdvice() {
		System.out.println("!!!security check - validate access rights!!!");
	}
	
	@Before("allClassPoint()")
	public void allAdviceUniversirty() {
		System.out.println("_________________________");
	}
	
	@Before("allClassPoint() && !getPointcutPublicVoid()")
	public void allAdviceButGetMethod() {
		System.out.println("                                   $$$$");
	}
}

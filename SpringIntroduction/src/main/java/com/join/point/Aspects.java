package com.join.point;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {
	
	@Pointcut("execution(public void add*(..))")
	public void pointcutAddAll() {}
	
	@Before("pointcutAddAll()")
	public void loggerAddMethod() {
		System.out.println("_______________________________");
		
		
		
		System.out.println("_______________________________");
	}
}

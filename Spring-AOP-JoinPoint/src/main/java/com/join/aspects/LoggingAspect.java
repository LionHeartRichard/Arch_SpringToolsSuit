package com.join.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	
	@Pointcut("execution(public void add*(..))")
	private void getPointcutPublicVoid() {}
	
	
	//----------------------------------------------------------
	
	
	@Before("getPointcutPublicVoid())")
	public void adviceAddMethod() {
		System.out.println("__________________________________________");
	}
	
}

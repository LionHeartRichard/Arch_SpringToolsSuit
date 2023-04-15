package com.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Animals {

	private static int count = 0;

	protected Animals() {
		System.out.println("__Create_BEAN-animals__");
		this.count++;
	}

	@Lazy
	@Autowired
	@Qualifier("jaguar")
	private FelineAnimals feline;

	public void action() {
		System.out.println(" действия животного");
	}
	
	public void printCount() {
		System.out.println("bean animals is created this count = " + this.count);
	}

	@PostConstruct
	public void init() {
		System.out.println("------------------------method----init-----------------------");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("------------------------method----DESTROY-----------------------");
	}
}

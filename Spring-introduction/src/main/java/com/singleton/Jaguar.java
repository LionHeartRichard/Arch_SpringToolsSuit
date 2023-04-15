package com.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Jaguar extends Animals implements FelineAnimals {

	private static int count = 0;
	
	protected Jaguar() {
		System.out.println("__Create_BEAN------------jaguar__");
		this.count++;
	}

	public void printCount() {
		System.out.println("Jaguar INSTANCE = " + this.count);
	}
	
	public void roar() {
		System.out.println("***********рычание-ягуара!!!");
	}

}

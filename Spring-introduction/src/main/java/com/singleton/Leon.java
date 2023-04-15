package com.singleton;

import org.springframework.stereotype.Component;

@Component
public class Leon extends Animals implements FelineAnimals {

	protected Leon() {
		System.out.println("__Create_BEAN----leon__");
	}

	public void roar() {
		System.out.println("рычание --- льва!!!");
	}

}

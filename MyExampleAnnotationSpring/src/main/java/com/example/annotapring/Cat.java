package com.example.annotapring;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat {
	public void say() {
		System.out.println("May-may!!!");
	}
}

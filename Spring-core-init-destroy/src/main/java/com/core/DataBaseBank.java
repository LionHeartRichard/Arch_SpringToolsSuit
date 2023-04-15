package com.core;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DataBaseBank {

	private int countConnection = 0;

	private DataBaseBank() {
		System.out.println("***Bean dataBase - is CERATED***");
		countConnection++;
	}

	@PostConstruct
	private void init() {
		System.out.println("___________________________INIT_______________PostConstract______");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx-----Destroy----xxxxxxxxxxx -- PreDestroy!!!");
	}
	
	public int getCountConnection() {
		return countConnection;
	}
}

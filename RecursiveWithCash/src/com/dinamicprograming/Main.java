package com.dinamicprograming;

public class Main {

	protected static int[] cashe = new int[100];

	public static void main(String[] args) {
		for (int i = 0; i < 44; i++) {
			System.out.println("i:" + i + " = " + fib(i));
		}

	}

	private static int fib(int i) {
		
		if (i <= 1)
			return i;
		
		if (cashe[i] != 0) {
			return cashe[i];
		} else {
			cashe[i] = fib(i - 1) + fib(i - 2);
			return cashe[i];
		}
	}

}

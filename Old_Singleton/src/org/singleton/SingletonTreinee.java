package org.singleton;

public class SingletonTreinee {

	private static int counter = 0;

	private SingletonTreinee() {
		counter ++;
	}

	private static SingletonTreinee singleton;

	public static SingletonTreinee getSingleton() {
		if (singleton == null) {
			singleton = new SingletonTreinee();
			return singleton;
		}
		return singleton;
	}
	
	public static void printCounter(){
		System.out.println("counter objects (SingletonTreinee) = " + counter);
	}
}

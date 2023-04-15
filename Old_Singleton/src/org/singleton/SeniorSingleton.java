package org.singleton;

public class SeniorSingleton {
	private volatile static SeniorSingleton singleton;
	
	private static int counter = 0;

	private SeniorSingleton() {
		counter++;
	}

	public static SeniorSingleton getInstance() {
		if (singleton == null) {
			synchronized (SeniorSingleton.class) {
				if (singleton == null) {
					singleton = new SeniorSingleton();
				}
			}
		}
		return singleton;
	}
	
	public static void printCounter(){
		System.out.println("senior counter = " + counter);
	}
}

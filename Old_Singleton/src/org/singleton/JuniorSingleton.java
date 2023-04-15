package org.singleton;

public class JuniorSingleton {

	private static int counter = 0;

	private static JuniorSingleton singleton;

	private JuniorSingleton() {
		counter++;
	}

	public synchronized static JuniorSingleton getSingleton() {
	    if (singleton == null) {
			return singleton;
		}
		return singleton;
	}
	
	public static void printCounter(){
		System.out.println("counter objects (JUNIOR) = " + counter);
	}

}

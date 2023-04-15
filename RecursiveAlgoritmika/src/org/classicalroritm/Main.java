package org.classicalroritm;

public class Main {
		
	public static void main(String[] args) {
		System.out.println("_factorial_ = " + funFactorial(5));
		System.out.println("greatest common divisor = " + funGCD(10, 15));
		System.out.println("funExtent = " + funExtent(2, 4));
		System.out.println("****___funFibonachi = " + funFibonachi(40));
	}

	private static int funFactorial(int n) {
		if (n == 0)
			return 1;
		return funFactorial(n - 1) * n;
	}

	private static int funGCD(int a, int b) {
		if (0 == b)
			return a;
		return funGCD(b, a % b);
	}

	public static long funExtent(long a, int n) {
		if (0 == n)
			return 1;
		if (1 == n % 2) {
			return a * funExtent(a, n - 1);
		} else {
			return funExtent(a * a, n / 2);
		}
	}

	private static int funFibonachi(int n) {
		if (1 >= n)
			return n;
		return funFibonachi(n - 1) + funFibonachi(n - 2);
	}
}

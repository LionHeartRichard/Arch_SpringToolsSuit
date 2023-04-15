package root;

import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static double x, y;
	private static char ch;

	public static void main(String[] args) {

		TwoVariable sum;
		TwoVariable mumnoj;
		TwoVariable division;
		TwoVariable difference;

		sum = (x, y) -> x + y;
		mumnoj = (x, y) -> x * y;
		division = (x, y) -> x / y;
		difference = (x, y) -> x - y;

		double result = sum.count(10, 20);
		System.out.println(result);
		result = mumnoj.count(10, 20);
		System.out.println(result);
		result = division.count(10, 20);
		System.out.println(result);
		result = difference.count(10, 20);
		System.out.println(result);

		System.out.println("______________________________________________________________");

		Map<Character, OperationTwoOnValues> map = Mapper.getInstance();

		x = getVariable();
		y = getVariable();
		ch = getOperation();

		map.forEach((k, v) -> {
			if (k == ch) {
				v.count(x, y);
				return;
			}
		});

		scanner.close();
	}

	public static double getVariable() {
		System.out.println("Enter to variable:");
		double i;
		if (scanner.hasNextDouble()) {
			i = scanner.nextDouble();
		} else {
			System.out.println("Your input invalide data!!!");
			scanner.next();
			i = getVariable();
		}
		return i;
	}

	public static char getOperation() {
		System.out.println("__Enter to OPERATION:");
		char ch;
		if (scanner.hasNext()) {
			ch = scanner.next().charAt(0);
		} else {
			System.out.println("__Invalide OPERATION!!!");
			scanner.next();
			ch = getOperation();
		}
		return ch;
	}

}

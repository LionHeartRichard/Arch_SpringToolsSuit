package parametr.calculator;

import java.util.Map;
import java.util.Scanner;

public class TestCalculator {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double x = getVariable();
		double y = getVariable();
		char ch = getOperation();
		scanner.close();
				
		Map<Character, Accountant> hashMap = Mapper.getMapOperation();

		hashMap.forEach((k, v) -> {
			if (k == ch) {
				v.count(x, y);
			}
		});
	}

	private static char getOperation() {
		System.out.println("Operation:");
		char ch;
		if (scanner.hasNext()) {
			ch = scanner.next().charAt(0);
		} else {
			System.out.println("is not possible OPERATION!!!");
			scanner.next();
			ch = getOperation();
		}
		return ch;
	}

	private static double getVariable() {
		System.out.println("Enter to variable:");
		double i;
		if (scanner.hasNextDouble()) {
			i = scanner.nextDouble();
		} else {
			System.out.println("is not possible variable!!!");
			scanner.next();
			i = getVariable();
		}
		return i;
	}
}

package parametr.calculator;

public class Sum implements Accountant {

	@Override
	public void count(double x, double y) {
		double result = x + y;
		System.out.println("Sum(" + x + ";" + y + ") = " + result);
	}

}

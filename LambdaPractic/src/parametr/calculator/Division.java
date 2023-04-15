package parametr.calculator;

public class Division implements Accountant{

	@Override
	public void count(double x, double y) {
		double result = x / y;
		System.out.println("Div(" + x + ";" + y + ") = " + result);
	}

}

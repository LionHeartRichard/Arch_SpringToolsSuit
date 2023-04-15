package parametr.calculator;

public class Substraction implements Accountant{

	@Override
	public void count(double x, double y) {
		double result = x - y;
		System.out.println("Sub(" + x + ";" + y + ") = " + result);
	}

}

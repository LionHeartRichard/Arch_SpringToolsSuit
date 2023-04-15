package parametr.calculator;

public class Multiplication implements Accountant{

	@Override
	public void count(double x, double y) {
		double result = x * y;
		System.out.println("Mum(" + x + ";" + y + ") = " + result);
	}

}

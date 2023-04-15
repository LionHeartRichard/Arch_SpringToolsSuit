package root;

public class Sum implements OperationTwoOnValues {

	@Override
	public void count(double x, double y) {
		double result = x + y;
		System.out.println("  " + x + " + " + y + " = " + result);
	}

}

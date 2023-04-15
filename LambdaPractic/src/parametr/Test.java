package parametr;

public class Test {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		FuncExpression func = n -> n % 2 == 0;
		System.out.println(sum(nums, func));		
	}

	private static int sum(int[] nums, FuncExpression func) {
		int result = 0;
		for (int i : nums) {
			if (func.isEquelse(i)) {
				result += i;
			}
		}
		return result;
	}

}

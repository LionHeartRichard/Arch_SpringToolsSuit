package root;

import java.util.HashMap;
import java.util.Map;

public class Mapper {

	private static Map<Character, OperationTwoOnValues> map = new HashMap<>();;

	public static Map<Character, OperationTwoOnValues> getInstance() {
		map.put('+', new Sum());
		map.put('*', new Mumnoj());
		map.put('/', new Division());
		map.put('-', new Difference());
		return map;
	}

}

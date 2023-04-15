package parametr.calculator;

import java.util.HashMap;
import java.util.Map;

public class Mapper {
	
	private static Map<Character, Accountant> map = new HashMap<>();
	
	public static Map<Character, Accountant> getMapOperation(){
		map.put('+', new Sum());
		map.put('*', new Multiplication());
		map.put('/', new Division());
		map.put('-', new Substraction());
		return map;
	}
}

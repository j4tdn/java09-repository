package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequenses = {"a", "b","c"};
		print(sequenses, String::toUpperCase);
		// Method reference  A::getMethod
	}
	
	private static void print (String[] strings, Function<String, String> function) {
	    if (strings == null || function == null) {
	    	throw new NullPointerException();
	    }
		for (String sequenceString : strings) {
			System.out.println(function.apply(sequenceString));
		}
	}
}

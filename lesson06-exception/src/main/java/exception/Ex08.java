package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = {"a", "b", "c"};
		print(sequences, String::toLowerCase);
	}
	
	private static void print(String[] sequences, Function<String, String> function) {
		if(sequences ==null || function == null) {
			throw new NullPointerException();
	}
}
}



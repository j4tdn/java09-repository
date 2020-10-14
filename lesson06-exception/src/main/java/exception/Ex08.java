package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = {"a","b",null,"c"};
		print(sequences,a -> a.toUpperCase());
	}
	private static void print(String[] sequences, Function<String,String> func) {
		if (sequences == null || func == null) {
			throw new NullPointerException();
		}
		for(String sequence : sequences) {
			System.out.println(func.apply(sequence));
		}
	}
}

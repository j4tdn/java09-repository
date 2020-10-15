package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = {"a", "b", "c"};
		print(sequences, String::toUpperCase);
	}
	private static void print(String[] sequenses, Function<String, String>function) {
		if(sequenses == null|| function == null) {
			throw new NullPointerException();
			}
		for (String sequence : sequenses) {
			System.out.println(function.apply(sequence));
		}
	}
}

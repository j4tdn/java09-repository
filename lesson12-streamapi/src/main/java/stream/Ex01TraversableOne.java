package stream;

import java.util.Arrays;

public class Ex01TraversableOne {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 8, 4, 9 };

		// get odd element
		// convert to stream
		int[] result = Arrays.stream(digits).filter(d -> d % 2 != 0).toArray();
		
		Arrays.stream(result).forEach(System.out::println);
	}
}

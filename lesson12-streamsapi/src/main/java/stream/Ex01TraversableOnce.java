package stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Ex01TraversableOnce {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 8, 4, 9 };
		// get odd element
		// convert to stream

		IntStream stream = Arrays.stream(digits);
		stream.filter(n -> n % 2 == 1).forEach(System.out::println);

//		stream.forEach(digit -> System.out.println(digit));
	}
}

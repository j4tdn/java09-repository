package stream;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex01TravelsableOnce {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 8, 4, 9 };
		// lay nhung phan tu le
		// convert to stream
//		IntStream stream = Arrays.stream(digits);
//		stream.forEach(digit -> System.out.println(digit));
//		stream.forEach(digit -> System.out.println(digit));//loi,vi stream chi chay 1 lan

		int[] result = Arrays.stream(digits).filter(digit -> {
			System.out.println("hello" + digit);
			return digit % 2 == 1;
		}).toArray();
		Arrays.stream(result).forEach(d -> System.out.println(d) );
	}
}

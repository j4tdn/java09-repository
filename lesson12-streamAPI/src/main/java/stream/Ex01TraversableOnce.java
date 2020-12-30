package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01TraversableOnce {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 8, 4, 9 };


		int[] result = Arrays.stream(digits).filter(digit->digit%2 !=0).toArray();

		System.out.println(result.length);
		Arrays.stream(result).forEach(System.out::println);

//		stream.forEach(digit->System.out.println(digit));



	}
}
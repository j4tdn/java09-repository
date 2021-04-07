package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import bean.Apple;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		Integer sum = digits.stream() // Stream<Integer> -> IntStream
				.mapToInt(Integer::intValue)
				.sum(); // Integer::sum
		
		System.out.println("sum: " + sum);
		
		Optional<Integer> sumOpt = digits.stream()
			  .reduce(Integer::max); // Integer::max
		System.out.println("sum: " + sumOpt.orElse(0));
	}
}

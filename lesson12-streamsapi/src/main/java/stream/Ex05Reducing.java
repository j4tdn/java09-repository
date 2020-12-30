package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		Integer sum = digits.stream().reduce(0, Integer::sum);// (a, b) -> a + b
		System.out.println("sum: " + sum);

		Optional<Integer> sumOpt = digits.stream().reduce(Integer::max);
		System.out.println("max: " + sumOpt.orElse(0));
	}
}

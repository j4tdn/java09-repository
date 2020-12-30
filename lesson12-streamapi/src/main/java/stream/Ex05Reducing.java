package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = digits.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		Optional<Integer> sumOpt = digits.stream().reduce(Integer::sum);
		System.out.println("sum: " + sumOpt.orElse(0));

	}
}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 4, 7, 4, 8, 44, 3, 67, 34, 54);
		Optional<Integer> sumOpt = digits.stream()
							.reduce(Integer::sum);

		System.out.println("sum: " + sumOpt.orElse(0));
		
		IntStream hehe = digits.stream().mapToInt(Integer::valueOf);
		
		
		
	}
}
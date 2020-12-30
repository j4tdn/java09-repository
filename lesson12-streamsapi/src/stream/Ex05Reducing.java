package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		Integer sum = digits.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		Optional<Integer> sumopt = digits.stream().reduce((a, b) -> a + b);
		// sumopt.ifPresent(val -> System.out.println("sum: " +val));
		System.out.println( sumopt.orElse(0));
		
		
		Optional<Integer> max = digits.stream().reduce((a, b) -> a > b?a:b);
		System.out.println("max: " + max.orElse(0));
		
		Optional<Integer> sum2 = digits.stream().reduce(Integer::sum);
		System.out.println(sum2);

		


	}
}

package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		Integer sum = digits.stream()
		.reduce(0, (a, b) -> a + b); //Integer::sum
		
		System.out.println("sum:" + sum);
		
		Optional<Integer> Optsum = digits.stream()
				.reduce( (a, b) -> a + b);
		Optsum.ifPresent(val -> System.out.println("Optsum: " + val));
		System.out.println(" sum: "+ Optsum.orElse(0));
		//max
		Optional<Integer> max = digits.stream()
				.reduce( (a, b) -> a > b ? a : b); //Integer::max
		max.ifPresent(val -> System.out.println("max: " + val));
	}
}

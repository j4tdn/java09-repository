package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 8, 16, 10, 100);

		//
		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);

		System.out.println("any elements divisor by 10: " + isDivBy10);

		Optional<Integer> isDivBy4 = numbers.stream().filter(number -> number % 4 == 0).findFirst();
		isDivBy4.ifPresent(System.out::println);

		Optional<Integer> isDivBy5 = numbers.stream().filter(number -> number % 5 == 0).findAny();

		boolean allLessThan100 = numbers.stream().allMatch(number -> number < 100);
		System.out.println("all less than 100: " + allLessThan100);

		boolean noGreaterThan0 = numbers.stream().noneMatch(number -> number < 0);
		System.out.println("no greater than 0: " + noGreaterThan0);

	}

}

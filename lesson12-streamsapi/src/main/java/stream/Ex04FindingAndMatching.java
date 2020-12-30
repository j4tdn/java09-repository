package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 16, 7, 2, 8, 10);

		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
		System.out.println("isDivBy10: " + isDivBy10);

		Optional<Integer> divBy4Opt = numbers.stream().filter(number -> number % 4 == 0).findAny();
		divBy4Opt.ifPresent(System.out::println);

		Optional<Integer> divBy5Opt = numbers.stream().filter(number -> number % 5 == 0).findAny();
		divBy5Opt.ifPresent(System.out::println);

		boolean isAllElementThan100 = numbers.stream().allMatch(number -> number < 100);
		System.out.println("isAllElementThan100: " + isAllElementThan100);

		boolean isAllElementLess0 = numbers.stream().noneMatch(number -> number > 0);
		System.out.println("isAllElementLess0: " + isAllElementLess0);

	}
}

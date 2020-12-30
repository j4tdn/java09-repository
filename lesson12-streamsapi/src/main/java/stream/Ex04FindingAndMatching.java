package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 16, 5, 7, 8, 10);

		// 1:is element %10==0
		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);

		System.out.println("isDiv10:" + isDivBy10);

		// 2:find first element %4==0

		Optional<Integer> divBy4Opt = numbers.stream().filter(number -> number % 4 == 0).findFirst();

		divBy4Opt.ifPresent(System.out::println);

		// 3:find element %5==0

		Optional<Integer> divBy5Opt = numbers.stream().filter(number -> number % 5 == 0).findAny();

		divBy5Opt.ifPresent(System.out::println);
		// 4:all element less than 100

		boolean isAllLessThan100 = numbers.stream().allMatch(number -> number < 100);

		System.out.println("isAllLessThan100:" + isAllLessThan100);

		// 5:no element greater than 0

		boolean isGreaterThan0 = numbers.stream().noneMatch(number -> number > 0);

		System.out.println("isGreaterThan0:" + isGreaterThan0);

	}
}

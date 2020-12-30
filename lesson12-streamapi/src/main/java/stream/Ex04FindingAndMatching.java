package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 8, 12);
		// 1. is there any element that is divisible 2
		boolean isDivBy10 = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("isDivBy10: " + isDivBy10);
		// 2. find the first element that is divisible 4
		Optional<Integer> divBy4Opt = numbers.stream().filter(n -> n % 4 == 0).findFirst();
		divBy4Opt.ifPresent(System.out::println);
		// 3. find the element that is divisible 5
		Optional<Integer> divBy5Opt = numbers.stream().filter(n -> n % 5 == 0).findAny();
		divBy5Opt.ifPresent(System.out::println);
		// 4. does all elements less than 100
		boolean isAllLestThan = numbers.stream().allMatch(num -> num < 100);
		System.out.println("isAllLessThan: " + isAllLestThan);
		// 5. does no elements greater than 0
		boolean ex6 = numbers.stream().noneMatch(num -> num > 0);
		System.out.println("ex6: " + ex6);
	}
}

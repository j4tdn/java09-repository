package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04Matching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 8, 10, 16);

		boolean isDivBy10 = numbers.stream().anyMatch(t -> t % 10 == 0);

		System.out.println("isDivBy10:" + isDivBy10);

		Optional<Integer> divBy4Opt = numbers.stream().filter(t -> t % 4 == 0).findFirst();

		divBy4Opt.ifPresent(System.out::println);
		
		Optional<Integer> divBy5Opt = numbers.stream().filter(t -> t % 5 == 0).findAny(); // bug java 8 : findFirst = findAny

		divBy5Opt.ifPresent(System.out::println);
		
		boolean isAllLessThan100 = numbers.stream().allMatch(t -> t < 100);
		System.out.println(isAllLessThan100);
		
		boolean isNoGreaterThan0 = numbers.stream().noneMatch(t -> t > 0);
		System.out.println(isNoGreaterThan0);
		
	}
}

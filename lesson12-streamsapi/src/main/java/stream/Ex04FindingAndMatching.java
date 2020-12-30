package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,5,7,2,4,10, 16, 8);
		boolean isDivBy10 = numbers.stream()
			   .anyMatch(number -> number % 10 == 0);
		System.out.println("isDivBy10: " + isDivBy10);
		
		Optional<Integer> divBy4Opt = numbers.stream()
				.filter(number -> number % 4 == 0)
				.findFirst();
		divBy4Opt.ifPresent(System.out::println);
		
		Optional<Integer> divBy5Opt = numbers.stream()
				.filter(number -> number % 5 == 0)
				.findAny();
		divBy5Opt.ifPresent(System.out::println);
		
		boolean allLess100 = numbers.stream()
			.allMatch(number -> number < 100);
		System.out.println("allLess100: " + allLess100);
		
		boolean noneGreater0 = numbers.stream()
				.noneMatch(number -> number > 0);
		System.out.println("noneGreater0: " + noneGreater0);
	}
}

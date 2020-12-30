package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 16, 7, 4, 7, 19);
		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
		
		if(isDivBy10) {
			System.out.println("yes, have one number divided by 10");
		} else {
			System.out.println("nooooooooooooooooooooooooooooo");
		}
		
		Optional<Integer> firstNumberDivBy4 = numbers.stream()
										.filter(number -> number % 4 == 0)
										.findFirst();
		firstNumberDivBy4.ifPresent(System.out::println);
		
		boolean isAllLessThan100 = numbers.stream()
										.allMatch(number -> number < 100);
		System.out.println("isAllLessThan100: " + isAllLessThan100);
		
		boolean isNoElementGreater0 = numbers.stream()
											.noneMatch(number -> number > 0);
		System.out.println("isNoElementGreater0: " + isNoElementGreater0);
	}
}

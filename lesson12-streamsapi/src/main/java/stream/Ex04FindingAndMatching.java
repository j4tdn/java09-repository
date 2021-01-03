package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.management.openmbean.OpenDataException;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 16, 7, 2, 8, 10);
		// 1st: is there any element that is divisible by 10
		boolean isDivBy10 = numbers.stream()
			   .anyMatch(number -> number % 10 == 0);	
		System.out.println("isDivBy10: " + isDivBy10);
		
		// 2nd: find the first element that is divisible by 4
		Optional<Integer> divBy4Opt = numbers.stream()
			   .filter(number -> number % 4 == 0)
			   .findFirst();
		divBy4Opt.ifPresent(val -> System.out.println("divBy4: " + val));
		
		// 3nd: find the element that is divisible by 5 in the list
		Optional<Integer> divBy5Opt = numbers.stream()
				   .filter(number -> number % 5 == 0)
				   .findAny(); // findFirst
		divBy5Opt.ifPresent(val -> System.out.println("divBy5: " + val));
		
		// 4th: does all elements less than 100
		
		// 5th: does no elements greater than 0
	
	}
}

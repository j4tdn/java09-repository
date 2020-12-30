package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 16, 7, 2, 8, 10);
		//is there any element that is divisible by 10
		boolean isDivBy10 = numbers.stream()
			.anyMatch(number -> number % 10 == 0);
		System.out.println("isDivBy10 : " + isDivBy10);
		
		//find the first element that is divisible by 4
		Optional<Integer> divBy40pt = numbers.stream()
			.filter(number -> number % 4 == 0)
			.findFirst();
		divBy40pt.ifPresent(val -> System.out.println("divBy4: " + divBy40pt.get()));
		
		//find the element that is divisible by 5 
		Optional<Integer> divBy5 = numbers.stream()
				.filter(number -> number % 5 == 0)
				.findAny();//findFirst
			divBy5.ifPresent(val -> System.out.println("divBy5: " + divBy5.get()));
		//does all elements less than 100
		boolean isGreaterThan100 = numbers.stream()
					.anyMatch(number -> number >= 100);
		System.out.println("isAllLessThan100: "  + !isGreaterThan100);
		
	}
}

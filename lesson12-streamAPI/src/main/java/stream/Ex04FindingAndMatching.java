package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 10);
		// co phan tu nao chia het cho 10 ko ?
		boolean isDivBy10 = numbers.stream()
				.anyMatch(number -> number % 10 == 0);
		System.out.println("isDicBy10: " + isDivBy10);

		// in so dau tien chia het cho 4
		Optional<Integer> divBy4 = numbers.stream()
				.filter(number -> number % 4 == 0)
				.findFirst();
		divBy4.ifPresent(val->System.out.println("divBy4: " + divBy4));
		
		// tim so chia het cho 5
		Optional<Integer> divBy5 = numbers.stream()
				.filter(number -> number % 5 == 0)
				.findAny();
		divBy5.ifPresent(val->System.out.println(divBy5));
		
		// co phai tat ca phan tu be hon 100
		boolean lessThan100 = numbers.stream()
				.allMatch(number -> number < 100);
		System.out.println("lessthan100: " +lessThan100);
		
		// co phan tu nao lon hon 0
		Optional<Integer> greaterThan0 = numbers.stream()
				.filter(number -> number >0)
				.findAny();
		greaterThan0.ifPresent(val->System.out.println(greaterThan0));
		
	}
}

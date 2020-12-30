package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 8, 10);
		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
		System.out.println("iisDivBy10 : " + isDivBy10);
		System.out.println("============");
		Optional<Integer> divBy40Opt = numbers.stream().filter(number -> number % 4 == 0).findFirst();
		divBy40Opt.ifPresent(System.out::println);
		System.out.println("============");
		Optional<Integer> divBy50Opt = numbers.stream().filter(number -> number % 5 == 0).findAny();
		divBy50Opt.ifPresent(System.out::println);
		System.out.println("============");
		boolean d  = numbers.stream().allMatch(number -> number < 100);
		System.out.println(d);
	}
}

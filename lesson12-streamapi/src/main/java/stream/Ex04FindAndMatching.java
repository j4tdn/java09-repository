package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,23,4,5,6,7,9,10,16);
		//1
		boolean isDivBy10 =	numbers.stream()
				.allMatch(number-> number%10==0);
		System.out.println(isDivBy10);
		
		//2
		Optional<Integer> divBy40pt= 
		numbers.stream()
		.filter(number->number%4==0)
		.findFirst();
		divBy40pt.ifPresent(System.out::println);
		
		System.out.println("=========");
		//3
		Optional<Integer> divBy50pt= 
				numbers.stream()
				.filter(number->number%5==0)
				.findAny();
				divBy50pt.ifPresent(System.out::println);
				System.out.println("==========================");
		//4
				
				boolean isLess100 =	numbers.stream().allMatch(number->number<100);
				System.out.println(isLess100);
	}
}

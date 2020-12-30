package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 8, 10,16,17);
		// is there any element that is divisible by 10
		boolean isDivBy10 = numbers.stream().anyMatch(number -> number % 10 == 0);
		System.out.println(isDivBy10);
		// find the first element that is divisible by 4
		Optional<Integer> divBy4OpT= numbers.stream().filter(number->number%4==0).findFirst();
		divBy4OpT.ifPresent(value->System.out.println(divBy4OpT+"  "));
		
		//find the element that is divisible by 5 in the list
		Optional<Integer> divBy5OpT= numbers.stream().filter(number->number%5==0).findAny();
		divBy5OpT.ifPresent(value->System.out.println(divBy5OpT+"  "));
		
		// does all elements less than 100
		boolean less100 =numbers.stream().allMatch(number->number<100);
		System.out.println(less100);

		// does no elements greater than 0
//		numbers.stream().
	}
}

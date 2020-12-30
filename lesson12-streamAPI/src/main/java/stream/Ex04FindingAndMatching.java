package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,5,7,9,4,2,10);
		//1 is there any element that is dividible 10
		boolean isDivBy10 =numbers.stream()
				.anyMatch(number -> number %10 ==0);
		System.out.println("is Divby10: " + isDivBy10);
		System.out.println("=======================");
		
		//2 find first element that is dividible 4
		Optional<Integer> divBy4Opt = numbers.stream()
				.filter(number -> number%4 ==0)
				.findFirst();
		divBy4Opt.ifPresent(val -> System.out.println("divby4: " + divBy4Opt));
		System.out.println("=======================");
		//3 find first element that is dividible 5
		Optional<Integer> divBy5Opt = numbers.stream()
				.filter(number -> number%5 ==0)
				.findAny();
		divBy5Opt.ifPresent(val -> System.out.println("divby4: " + divBy5Opt));
		//4 does all element less than 100
		System.out.println("=======================");
		boolean lessThan100 =numbers.stream()
				.anyMatch(number -> number<100);
		System.out.println("lessThan100: " + lessThan100);
		System.out.println("=======================");
		
				
	}
	

}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex04FindingAndMatching {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//1st: is there any element that is divisible by 10
	boolean isDivBy10 = numbers.stream()
	.anyMatch(number -> number%10 == 0);
	System.out.println("isdivby10: "+ isDivBy10);
	//cau 2:
	Optional<Integer> divBy4Opt = numbers.stream()
	.filter(number -> number%4 == 0)
	.findFirst();
	divBy4Opt.ifPresent(val -> System.out.println((divBy4Opt + " ")));
	//cau 3
	Optional<Integer> divBy5Opt = numbers.stream()
			.filter(number -> number % 5 == 0)
			.findFirst();
			divBy5Opt.ifPresent(val -> System.out.println((divBy5Opt + " ")));
			
	//cau 4
		 boolean less100 = numbers.stream()				
				.allMatch(number -> number < 100);
				System.out.println(less100);
		
	
}
}

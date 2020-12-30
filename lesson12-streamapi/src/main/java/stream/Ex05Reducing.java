package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,3,5,7);
		Integer sum = digits.stream().
		 reduce(0,(a,b)->a+b);
		
		System.out.println(sum);
		Optional<Integer>sumOpt =	digits.stream().reduce((a,b) -> a+b);
		//sumOpt.ifPresent(value->System.out.println(sum));
		//System.out.println(sumOpt);
		System.out.println(sumOpt.orElse(0));
	}
}

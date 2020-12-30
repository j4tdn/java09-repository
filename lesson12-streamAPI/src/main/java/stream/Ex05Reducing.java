package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,3,5,6);
		Integer sum= digits.stream()
				.reduce(0,(a,b)->a+b);
		
		System.out.println("sum: " + sum);
		
		Optional<Integer> sumOpt=digits.stream()
			.reduce((a,b)->(a+b));
			//.reduce((a,b)->(a>b?a:b));//tim  Max
		
		//sumOpt.ifPresent(val -> System.out.println("sum: " + val));
		System.out.println("sum: " + sumOpt.orElse(0));
	}
}

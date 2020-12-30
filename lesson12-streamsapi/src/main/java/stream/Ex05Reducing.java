package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 7, 6);

		int sum = digits.stream().reduce(0, (a, b) -> a + b);//Integer::sum
		System.out.println("sum:" + sum);

		Optional<Integer> sumOpt = digits.stream().reduce((a, b) -> a + b);//Integer::max
	//	sumOpt.ifPresent(val->System.out.println("sum:"+val));
		System.out.println("sum:"+sumOpt.orElse(0));
	}
}

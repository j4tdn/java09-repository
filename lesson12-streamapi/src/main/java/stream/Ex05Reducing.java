package stream;

import java.util.Arrays;
import java.util.List;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		Integer sum = digits.stream().reduce(0, (a, b) -> a + b);  // Integer::sum

		System.out.println("sum:" + sum);

		Integer sumOpt = digits.stream()
										 .mapToInt(Integer::intValue).sum();//Integer::max
		
		System.out.println(sumOpt);
	}
}

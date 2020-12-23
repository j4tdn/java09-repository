package stream;

import java.util.Arrays;

public class Ex01TraversableOnce {
	public static void main(String[] args) {
		int[] digits = {1, 3, 6, 2, 9, 33};
		
		int[] result = Arrays.stream(digits)
					.filter(digit -> digit % 2 == 0)
					.toArray();
		
		System.out.println("Length: " + result.length);
	}
}

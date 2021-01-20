package bai1;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1,2,3,4,5,6,5,5,3,1};
		Arrays.stream(digits).distinct().forEach(System.out::println);
	}
}

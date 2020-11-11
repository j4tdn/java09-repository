package ex03;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "wewwe9323ew232w82";
		String[] s = s1.split("[a-z]+");
		System.out.println(Arrays.toString(s));
		System.out.println(getLargestNumbers(s));
	}

	private static int getLargestNumbers(String[] s1) {
		// String results= "";
		int max = 0;
		for (String s : s1) {
			Integer a = Integer.valueOf(s);
			if (a > max) {
				max = a;

			}

		}
		return max;
	}
}

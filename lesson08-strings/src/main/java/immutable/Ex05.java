package immutable;

import java.util.Arrays;

public class Ex05 {
	// Get unique numbers: 1 2 3 2=> 1 3
	public static void main(String[] args) {
		String s = "1,2,2,3";
		System.out.println(getUniqueNumbers(s));
	}

	private static String getUniqueNumbers(String input) {
		String result = "";
		String[] numbers = input.trim().split(",");
		boolean[] flags = new boolean[numbers.length];
		for (int out = 0; out < numbers.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < numbers.length; in++)

				{
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (flags[i] = false) {
				result += numbers[i];
			}

		}
		return result;
	}
}

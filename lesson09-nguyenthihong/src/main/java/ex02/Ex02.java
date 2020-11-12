package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] result = getLargestNumbers("01a2b3456cde478", "aa6b546c6e22h");
		System.out.println(String.join(",", result));
	}

	public static String[] getLargestNumbers(String... ss) {
		String[] result = new String[ss.length];
		int index = 0;
		for (String string : ss) {
			String[] stringNumbers = string.split("[a-z]+");
			int max = -1;
			if (stringNumbers[0].equals("")) {
				max = Integer.parseInt(stringNumbers[1]);
			} else {
				max = Integer.parseInt(stringNumbers[0]);
			}
			for (int i = 1; i < stringNumbers.length; i++) {
				int temp = Integer.parseInt(stringNumbers[i]);
				if (temp > max) {
					max = temp;
				}
			}
			result[index++] = String.valueOf(max);
		}

		result = Arrays.copyOfRange(result, 0, index);
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result.length - i - 1; j++) {
				if (Integer.parseInt(result[j]) > Integer.parseInt(result[j + 1])) {
					String tmp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = tmp;
				}
			}
		}

		return result;

	}

}

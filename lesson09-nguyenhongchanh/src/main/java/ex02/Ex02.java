package ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] result = getLargestNumbers("01a2b3456cde478", "aa6b546c6e22h");
		System.out.println(String.join(",", result));
	}

	public static String[] getLargestNumbers(String... s) {
		String[] result = new String[s.length];
		int a = 0;
		for (String string : s) {
			
			String[] strings = string.split("[a-z]+");
			int max = 0;
			
			if (strings[0].equals("")) {
				max = Integer.parseInt(strings[1]);
			} else {
				max = Integer.parseInt(strings[0]);
			}
			
			for (int i = 1; i < strings.length; i++) {
				int t = Integer.parseInt(strings[i]);
				if (t > max) {
					max = t;
				}
			}
			result[a++] = String.valueOf(max);
		}

		result = Arrays.copyOfRange(result, 0, a);
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result.length - i - 1; j++) {
				if (Integer.parseInt(result[j]) > Integer.parseInt(result[j + 1])) {
					String t = result[j];
					result[j] = result[j + 1];
					result[j + 1] = t;
				}
			}
		}

		return result;

	}

}

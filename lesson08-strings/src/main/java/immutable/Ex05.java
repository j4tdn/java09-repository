package immutable;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		String s = "1,2,2,3";
		String result[] = getUniqueNumbers(s);
		System.out.println(String.join(",", result));
	}
	
	private static String[] getUniqueNumbers (String input) {
		String[] result = new String [input.length()];
		String[] numbers = input.trim().split(",");
		int index = 0;
		for (String number : numbers) {
			if (input.indexOf(number) == input.lastIndexOf(number)) {
				result[index++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0,index);
	}
}
package exercise2;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] input = new String[2];
		input[0] ="aa6b546c6e22h";
		input[1]="aa6b326c6e22h";
		String[] result =  getLargestNumber(input);
		for (String x : result) {
			System.out.println(x);
		}
	}
	
	private static String[] getLargestNumber (String[] input) {
		int[] result = new int[input.length];
		int index = 0;
		for (int i = 0; i< input.length;i++) {
			String[] tmp = input[i].split("[a-z]+");
			int max =0;
			if (tmp.length !=0) {
				tmp = Arrays.copyOfRange(tmp, 1, tmp.length);
				max = Integer.parseInt(tmp[0]);
				for (String value : tmp) {
					if (max < Integer.parseInt(value)) {
						max = Integer.parseInt(value);
					}
				}
			}	
			result[index++] = max;
		}
		Arrays.sort(result);
		String[] resultString = new String[input.length];
		for (int i =0; i< result.length;i++) {
			resultString[i] = "" + result[i];
		}
		return resultString;
	}
}

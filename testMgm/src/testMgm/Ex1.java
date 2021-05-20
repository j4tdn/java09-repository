package testMgm;

import java.util.Arrays;

public class Ex1 {
	
	public static void main(String[] args) {
		int[] digits = {1, 2, 3, 4, 1, 2};
		int[] result = getDigits(digits);
		for (int i:result) {
			System.out.println(i);
		}
	}
	
	public static int[] getDigits(int[] digits) {
		int[] result = new int[100];
		boolean[] kt = new boolean[100];
		for (int i = 0; i < digits.length; i++) {
			kt[i] = true;
		}
		
		for (int i = 0; i < digits.length - 1; i++) {
			if (kt[i]) {
				for (int j = i + 1; j < digits.length; j++) {
					if (kt[j] && digits[i] == digits[j]) {
						kt[i] = false;
						kt[j] = false;
					}
				}
			}
		}
		
		int dem = 0;
		for (int i = 0; i < digits.length; i++) {
			if (kt[i]) {
				dem++;
				result[dem - 1] = digits[i];
			}
		}
		
		return Arrays.copyOf(result, dem);
	}
}


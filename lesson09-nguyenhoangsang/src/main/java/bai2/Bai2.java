package bai2;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai2 {
	public static void main(String[] args) {
		String str = "124dad12daaa2ds66das99,23gr65fs3f6,654f2f99hf9";
		int count = 0;
		String[] arr = str.split(",");
		int[] arrNumber = new int[arr.length];
		for(String s : arr) {
			String[] arr1 = s.split("[a-z]++");
			int max = 0;
			for(String stringNumber : arr1) {
				int number = Integer.parseInt(stringNumber);
				if (number > max) {
					max = number;
				}
			}
			arrNumber[count++] = max;
		}
		Arrays.sort(arrNumber);
		for(int a : arrNumber) {
			System.out.println(a);
		}
	}

}

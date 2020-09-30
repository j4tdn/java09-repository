package Test01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] list = { 3, 4, 5, 6, 7, 4, 5, 8, 9, 1, 8 };		
		int[] result = getUniqueNumbers(list);
		Arrays.sort(result);
		for (int i : result) {
			System.out.println(i+"   ");
		}
	}
	public static int[] getUniqueNumbers(int[] a) {
		int count, len = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				len++;
			}
		}
		int list[] = new int[len];
		int x = 0, count1;
		for (int i = 0; i < a.length; i++) {
			count1 = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count1++;
				}
			}
			if (count1 == 1) {
				list[x] = a[i];
				x++;
			}
		}
		return list;
	}
}

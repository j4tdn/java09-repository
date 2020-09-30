package ex04;

import java.util.Scanner;

public class leastCommonMultiple {

	int greatestCommonDivisor(int a, int b) {
		if (a == b)
			return a;
		if (a > b) {
			return greatestCommonDivisor(a - b, b);
		} else
			return greatestCommonDivisor(a, b - a);
	}

	int leastCommonMul(int a, int b) {		//boi 2 so
		return ((a * b) / greatestCommonDivisor(a, b));
	}

	int getLeastCommonMultiple(int[] arr, int n) {
		int tmp = leastCommonMul(arr[0], arr[1]);
		for (int i = 2; i < n; i++) {
			tmp = leastCommonMul(tmp, arr[i]);
		}
		return tmp;
	}
	public static void main(String[] args) {
		int arr[] = { 6, 7, 8 };
		int n = arr.length;

	}
}

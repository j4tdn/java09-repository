package exercises;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= {1,1,2,1,3,3};
		for  (int x : uniqueNumbers(a)) {
			System.out.println(x+" ");
		}
	}

	private static int[] uniqueNumbers(int[] a) {
		int[] result=new int [a.length];
		int[] b = new int[1000];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (b[a[i]] == 1) {
				result[k++] = a[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0,k);
	}
}

package testMgm;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[][] digits = {{8,1,9}, {7,2,6}, {3,4,5}};
		int result = getSaddlePoint(digits);
		System.out.println(result);
	}
	
	public static int getSaddlePoint(int[][] digits) {
		int n = digits.length;
		int min[] = new int[n];
		int minT = 0;
		int maxT = 0;
		int max[] = new int[n];
		for (int i = 0; i < n ; i++) {
			minT = digits[i][0];
			min[i] = 0;
			for (int j = 1; j < n; j++) {
				if(minT > digits[i][j]) {
					minT = digits[i][j];
					min[i] = j;
				}
			}
		}
		
		for (int j = 0; j < n ; j++) {
			maxT = digits[0][j];
			max[j] = 0;
			for (int i = 1; i < n; i++) {
				if(maxT < digits[i][j]) {
					maxT = digits[i][j];
					max[j] = i;
				}
			}
		}
		int dem = 0;
		int[] result = new int[100];
		for (int i = 0; i < n; i++) {
			if (digits[i][min[i]] == digits[max[min[i]]][min[i]]) {
				dem++;
				result[dem - 1] = digits[i][min[i]];
			}
		}
		
		return dem;
	}

}

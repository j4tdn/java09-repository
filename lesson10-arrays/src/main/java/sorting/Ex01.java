package sorting;

import java.util.Arrays;

import utils.ArraysUtils;
import utils.ArraysUtils.SortOrder;

public class Ex01 {
	public static void main(String[] args) {
		int[] number = { 1, 5, 9, 4, 6, 11 };

		ArraysUtils.bubbleSort(number);
		ArraysUtils.print(number);
		System.out.println();
		ArraysUtils.soft(number, SortOrder.DESC);
		ArraysUtils.print(number);
	}



	

}

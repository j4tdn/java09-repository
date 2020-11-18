package sorting;

import java.util.Arrays;

import util.ArraysUtils.SortOrder;

import static util.ArraysUtils.*;
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		
		//bubbleSort(numbers);
		printf(numbers);
		System.out.println("===================");
		//quick sort : default: ascending
		//with primitive array
		sort(numbers, SortOrder.DESC);
		printf(numbers);
	}
	

}

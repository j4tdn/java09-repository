package sorting;

import java.util.Arrays;

import utils.ArrayUtils;
import utils.ArrayUtils.SortOrder;

import static utils.ArrayUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		bubbleSort(numbers);
		ArrayUtils.printf(numbers);
		
		System.out.println("=================");
		
		// quick sort: default: ascending
		sort(numbers, SortOrder.DESC );
		printf(numbers);
	}

	
}

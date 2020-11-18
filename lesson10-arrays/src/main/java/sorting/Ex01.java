package sorting;

import java.util.Arrays;
import static utils.ArrayUtils.*;
import utils.ArrayUtils.*;


import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		// descending
		bubbleSort(numbers);
		// quick sort: default ascending
	printf(numbers);
		System.out.println("==================");
		sort(numbers,SortOrder.DESC);
		printf(numbers);
		

	}

}

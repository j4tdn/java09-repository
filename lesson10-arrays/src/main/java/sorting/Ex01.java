package sorting;

import static utils.ArrayUtils.*;

import utils.ArrayUtils.SortOrder;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 9, 3, 6, 11};
		//bubbleSort(numbers);
		sort(numbers, SortOrder.DESC);
		println(numbers);
	}
	
}

package sorting;

import java.util.Arrays;

import utils.ArraysUtils;
import static utils.ArraysUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers= {1,5,9,4,6,11};
		//descending
		bubbleSort(numbers);
		printf(numbers);
		
		//quick sort: default ascending
		Arrays.sort(numbers);
		printf(numbers);
		
	}
	
	
}

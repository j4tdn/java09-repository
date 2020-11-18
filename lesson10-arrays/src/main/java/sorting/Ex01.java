package sorting;

import java.util.Arrays;

import utils.ArrayUtils;
import static utils.ArrayUtils.*;
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers= {1,5,9,4,6,11};
		bubbleSort(numbers);
		
		//quick sort: default: asccending
		Arrays.sort(numbers);
		ArrayUtils.printf(numbers);
	}
	
}

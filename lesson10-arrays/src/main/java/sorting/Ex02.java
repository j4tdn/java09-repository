package sorting;

import static utils.ArrayUtils.*;
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "bbb", "ahihi", null, "5f", "$llll"};
		bubbleSort(sequences);
		println(sequences);
		
		bubbleSortNullLast(sequences);
		println(sequences);
	}
}
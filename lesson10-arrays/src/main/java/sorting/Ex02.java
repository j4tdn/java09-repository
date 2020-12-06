package sorting;

import static utils.ArrayUtils.*;

public class Ex02 {
	// 1 7 8 4 6 null null
	public static void main(String[] args) {
		// null first, null last
		String[] sequences = { "a", "1", null, "7", null, "c", "5", "k", "b" };
		bubbleSort(sequences);
		printf(sequences);
	}
}

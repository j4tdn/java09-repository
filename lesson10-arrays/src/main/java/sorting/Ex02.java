package sorting;

import static util.ArraysUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		// null first
		String[] sequences = { "a", "1", "7", null, "c", "5", null, "k", "b" };
		bubbleSort(sequences);
		printf(sequences);

	}
}

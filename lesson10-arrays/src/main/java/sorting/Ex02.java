package sorting;

import static utils.ArrayUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		//null last, null first
		String[] sequences = {"a", "c", "1", null, "7", "k", "5",null, "b"};
		bubbleSort(sequences);
		prints(sequences);
	}
}

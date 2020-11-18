package sorting;

import static util.ArraysUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		//null first
		String[] sequences = { null,"a", "1", "7", "c",null, "k", "b", "5" };
		bubbleSort(sequences);
		printf(sequences);
	}
}

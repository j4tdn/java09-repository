package sorting;

import utils.ArrayUtils;

import static utils.ArrayUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c",null, "k", "1", "b", null,"2", "e" };
		ArrayUtils.bubbleSort(sequences);
		printf(sequences);
	}
}

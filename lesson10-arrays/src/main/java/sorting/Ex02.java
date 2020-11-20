package sorting;

import utils.ArrayUtils;
import static utils.ArrayUtils.*;
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {
				"a","1","7", "5","c", "k", "b"
		};
		bubbleSort(sequences);
		printf(sequences);
	}
}

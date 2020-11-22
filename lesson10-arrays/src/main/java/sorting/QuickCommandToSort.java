package sorting;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;
public class QuickCommandToSort {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "c", null, "7", "k",null, "5", "B" };
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(),reverseOrder())));
		utils.ArrayUtils.printf(sequences);
	}
}

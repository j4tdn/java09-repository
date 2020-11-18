package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

import static utils.ArrayUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "bbb", "ahihi", null, "5f", "$llll"};
		
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity()
													, reverseOrder())));
		println(sequences);
	}
}

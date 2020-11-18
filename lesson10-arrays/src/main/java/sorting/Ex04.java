package sorting;

import static utils.ArrayUtils.printf;
import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.function.Function;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = {"a","1","c",null,"5",null,"5"};
		Arrays.sort(sequences, nullsLast(comparing(Function.identity(),reverseOrder())));
//		Arrays.sort(sequences, (o1,o2) -> o1.compareTo(o2));
		printf(sequences);
	}
}

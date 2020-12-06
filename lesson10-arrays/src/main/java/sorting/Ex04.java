package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { 
				"a", "1", "7", null, 
				"c", "5", "k", null, "b" };
		// (String o1, String o2) -> {return 0;}
		// T: parameterized type (generic from java 1.5)
		/*
		Arrays.sort(sequences, (String o1, String o2) -> {
				return o1.compareTo(o2);
			}
		);
		*/
		
		Arrays.sort(sequences,
				nullsLast(comparing(Function.identity(), 
						   reverseOrder())));
		printf(sequences);
	}
}

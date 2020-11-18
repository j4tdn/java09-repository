package sorting;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Comparator;
import java.util.function.Function;

import static utils.ArrayUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1",null, "7", "c",null, "5", "k", "b" };
		// T : parameterized type(generic from java 1.5)
		// lambda: (String o1, String o2)->{return 0;}
		/*
		 * Arrays.sort(sequences, (String o1, String o2) -> { return o1.compareTo(o2); }
		 * );
		 */
		Arrays.sort(sequences, nullsLast(comparing(Function.identity(), reverseOrder())));

		printf(sequences);

	}

}

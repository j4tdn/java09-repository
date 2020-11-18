package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.Arrays.*;
import static java.util.Comparator.*;
import static util.ArraysUtils.*;
public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "7", "c", null, "5", "k", "b" };

		// T: parameterized type (generic from java 1.5)
		//Arrays.sort(sequences, (o1, o2) -> o1.compareTo(o2));
		
		Arrays.sort(sequences, nullsLast(comparing(Function.identity(), reverseOrder())));
		
		
		printf(sequences);

	}
}

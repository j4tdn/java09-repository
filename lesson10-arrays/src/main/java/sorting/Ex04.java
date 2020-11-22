package sorting;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;
public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "1", "7", null, "k", "5", null, "b"};

		//T: parameterized type (generic from java 1.5)
		Arrays.sort(sequences, (String o1, String o2) -> {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		);

		Arrays.sort(sequences, nullsLast(comparing(Function.identity(), reverseOrder())));
		prints(sequences);
	}
}

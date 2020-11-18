package sorting;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Comparator;
import java.util.function.Function;

import static utils.ArraysUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "7", "c", "5", "k",null, "b" };
/*
		// T la 1 parameterized type (generic from java 1.5)
		Arrays.sort(sequences, (String o1, String o2) ->{
				return o1.compareTo(o2);
			}
	);*/
		Arrays.sort(sequences,nullsFirst(comparing(Function.identity(),reverseOrder())));
		printf(sequences);
	}
}

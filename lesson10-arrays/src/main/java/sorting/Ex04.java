package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences= {"a","2","c",null,"k","5",null,"1","b"};
		//function interface
		//() -> {}
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(),
				reverseOrder()))
				);
		printf(sequences);
	}
}

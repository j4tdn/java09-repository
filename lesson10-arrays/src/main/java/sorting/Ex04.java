package sorting;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.function.Function;
import static utils.ArrayUtils.*;

public class Ex04 {
public static void main(String[] args) {
	String[] sequences = {"a", "1", "7", "c", "5", "k", "b"};
	Arrays.sort(sequences,
			nullsLast(comparing(Function.identity(), reverseOrder())));
	printf(sequences);
}
}
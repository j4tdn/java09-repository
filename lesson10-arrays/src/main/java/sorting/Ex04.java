package sorting;

import static util.ArraysUtils.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.Comparator.*;

//biểu thưc lambda là 1 thể hiện của interface
public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = {  "a", "1","null", "7", "c", "k", "b", "5" };

		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// neu muon giam dan thi hoan doi o1 vs o2
			}
		});
		Arrays.sort(sequences,nullsFirst(comparing(Function.identity(),reverseOrder())));
		printf(sequences);
	}
}

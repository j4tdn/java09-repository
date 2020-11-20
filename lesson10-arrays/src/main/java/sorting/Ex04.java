package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;
public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = {
				"a","1","7",null, null,
				"c","5","k","b"
		};
//		Arrays.sort(sequences, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// null first
//				if(o1 == null) {
//					return -1;
//				}
//				if(o2 == null) {
//					return 1;
//				}
//				return o1.compareTo(o2);
//			}
//		});
		Arrays.sort(sequences, 
				nullsLast(comparing(Function.identity(), 
				reverseOrder())));
		printf(sequences);
	}
}

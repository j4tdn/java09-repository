package sorting;

import java.util.Arrays;
import java.util.function.Function;

import static  java.util.Comparator.*;

import utils.ArrayUtils;
public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", "k",null, "1", "b", "2", "e" };
		//Arrays.sort(sequences);
//		Arrays.sort(sequences, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//
//			}
//
//		});
		Arrays.sort(sequences,nullsLast(comparing(Function.identity(),reverseOrder())));
		ArrayUtils.printf(sequences);
	}
}

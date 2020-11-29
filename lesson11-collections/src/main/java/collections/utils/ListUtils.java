package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}

//public static void printf(List<String> sequences) {
//	for (String sequence : sequences) {
//		System.out.println(sequence);
//	}
//}
	public static <E> void printf(List<E> numbers) {
		for (E number : numbers) {
			System.out.print(numbers + "  ");
		}
		System.out.println("");
	}
}

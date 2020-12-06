package collections.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {
	private CollectionUtils() {

	}

//public static void printf(List<String> sequences) {
//	for (String sequence : sequences) {
//		System.out.println(sequence);
//	}
//}
	public static <E> void printf(Collection<E> numbers) {
		for (E number : numbers) {
			System.out.print(numbers + "  ");
		}
		System.out.println("");
	}
	public static void printfwc(List<? super Number> elements) {
		for (Object element:elements) {
			System.out.println(element);
		}
	}
}

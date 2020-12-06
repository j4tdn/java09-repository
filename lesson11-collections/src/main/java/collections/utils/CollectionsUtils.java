package collections.utils;

import java.util.Collection;
import java.util.List;

public class CollectionsUtils {
	private CollectionsUtils() {
		
	}
	public static <E> void printf(Collection<E> elements) {
		for(E sequence : elements) {
			System.out.print(sequence + " ");
		}
		System.out.println();
	}
	public static void printfwc(List<? super Number> elements) {
		for(Object sequence : elements) {
			System.out.print(sequence + " ");
		}
		System.out.println();
	}
}

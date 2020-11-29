package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	public static <E> void printf(List<E> elements) {
		for(E sequence : elements) {
			System.out.print(sequence + " ");
		}
		System.out.println();
	}
}

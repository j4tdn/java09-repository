package utils;

import java.util.List;

public class ListUtils {

	private ListUtils() {
		
	}
	/**
	 * required: E must override toAString
	 * @param <E> generic type
	 * @param elements
	 */

	public static <E>void show(List<E> elements) {
		for ( E element : elements) {
			System.out.println(element);
		}
		
	}
}
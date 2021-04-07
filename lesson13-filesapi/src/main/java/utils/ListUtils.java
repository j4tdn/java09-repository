package utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}

	/**
	 * Required: E must override toString.
	 * 
	 * @param <E>      generic type
	 * @param elements printed elements
	 */
	public static <E> void show(List<E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
}

package utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
	}

	/**
	 * Require: E must override toString
	 * 
	 * @param <E>      generic type
	 * @param elements printed elements
	 */

	public static <E> void show(List<E> data) {
		for (E element : data) {
			System.out.println(element);
		}
		System.out.println();
	}
}

package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}
	//generic method
	//generic type
	public static <E> void print(List<E> elements) {
		for (E element : elements) {
			System.out.print(element+" ");
		}
		System.out.println(" ");
	}
}
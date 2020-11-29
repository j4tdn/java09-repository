package collections.utils;

import java.util.List;

public class ListUtils {

	public static <E> void printf(List<E> elements) {
		for (E e : elements) {
			System.out.print(e + "  ,  ");
		}
		System.out.println();
	}
}

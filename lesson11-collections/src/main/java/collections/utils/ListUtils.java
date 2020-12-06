package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
	}
	
	
	// generic method
	// E: generic type => compile: Object
	// Integer, Double, Long
	// technical restriction
	public static <E> void printf(List<E> elements) {
		for (E element: elements) {
			System.out.println(element);
		}
	}
	
	public static void printfwc(List<? super Number> elements) {
		for (Object element: elements) {
			System.out.println(element);
		}
	}
}

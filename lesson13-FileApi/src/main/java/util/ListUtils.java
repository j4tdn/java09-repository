package util;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	
	public static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}

package utils;

import java.util.List;

public class ListUtils {
	public ListUtils() {
		
	}
	
	public static <E> void show(List<E> elements) {
		for(E element:elements) {
			System.out.println(element);
		}
	}
}

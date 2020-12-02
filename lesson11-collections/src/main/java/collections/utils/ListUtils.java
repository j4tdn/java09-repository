package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	
	public static <T> void printf(List<T> numbers) {
		for(T item : numbers) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	public static void printfwc(List<?> numbers) {
		for(Object item : numbers) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}

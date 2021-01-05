package collections.utils;

import java.util.Collection;
import java.util.List;

public class ListUtils {
	private ListUtils() {
	}
	
	public static <E> void printf(Collection<E> elements) {
		for (E element:elements) {
			System.out.println(element);
		}
	}
	public static void printfwc(List<? super Number> elements) {
		for (Object element:elements) {
			System.out.println(element);
		}
	}
	

}

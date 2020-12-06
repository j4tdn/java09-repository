package collections.utils;

import java.util.Collection;
import java.util.List;

public class ListUtils {
	private ListUtils() {

	}
	//generic method
	//generic type
	public static <E> void print(Collection<E> elements) {
		for (E element : elements) {
			System.out.print(element+" ");
		}
		System.out.println(" ");
	}
	public static void printwc(List<? super Number> elements) {
		for (Object element : elements) {
			System.out.print(element+" ");
		}
		System.out.println(" ");
	}
}
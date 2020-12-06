package collections.utils;

import java.util.Collection;
import java.util.List;

public class CollectiontUtils {
	private CollectiontUtils() {

	}

	//generic method
	//E: generic type => compile time

	public static <E> void printf(Collection <E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
	
	public static void printfwc(List<? super Number> elements) {
		for (Object element : elements) {
			System.out.println(element);
		}
	}
}

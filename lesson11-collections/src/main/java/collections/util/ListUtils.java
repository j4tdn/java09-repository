package collections.util;

import java.util.Collection;
import java.util.List;

public class ListUtils {
	private ListUtils() {

	}
	
	//generic method  ->E:generic type
	public static <E> void printf(Collection<E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
//	public static void printfwc(List<? extends Number> elements) {
//		for (Number element : elements) {
//			System.out.println(element);
//		}
//		System.out.println();
//	}
	
	public static void printfwc(List<? super Number> elements) {
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	
}

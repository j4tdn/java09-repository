package collection.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtils {
	private CollectionUtils() {
	}

	public static <E> void printf(Collection<E> elements) {
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	//printf same same printwc
	public static  void printfwc(List<? super Number> elements) {
		for (Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
}

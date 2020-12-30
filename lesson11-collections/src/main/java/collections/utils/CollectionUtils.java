package collections.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtils {
	private CollectionUtils() {
		
	}

	//generic method
	//E: generic type 
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

package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}
	
	
	//generic method
	//E: generic time=> compile(object)
	public static <E> void printf(List<E> elements) {
		for (E element:elements) {
			System.out.println(element);
		}
	}
}
package collection.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
	}

	public static <E> void printf(List<E> elements) {
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

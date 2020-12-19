package utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	public static <E> void show(List<E> data){
		for(E element: data) {
			System.out.println(element);
		}
	}
}

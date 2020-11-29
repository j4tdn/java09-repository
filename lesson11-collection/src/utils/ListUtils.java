package utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	// generic method 
	// E: generic type => compile: Object 
	public static <E> void printfInt(List<E> elements) {
		for(E element: elements) {
			System.out.println(element);
		}
	}
	
//	public static void printfStr(List<Integer> elements) {
//		for(Integer element: elements) {
//			System.out.println(element);
//		}
//	}
}

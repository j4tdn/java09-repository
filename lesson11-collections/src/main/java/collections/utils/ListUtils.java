package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	
	public static void printfStr(List<String> elements) {
		for (String element: elements) {
			System.out.println(element);
		}
	}
	
	public static void printfInt(List<Integer> elements) {
		for (Integer element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

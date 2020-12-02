package collection.util;

import java.util.List;

public class ListUtil {
	private ListUtil() {
	}

	
	
	public static <E> void printf(List<E> numbers) {
		for (E number : numbers) {
			System.out.print(numbers+"  ");
		}
		System.out.println("");
	}
	public static void printfWC(List<? super Number> numbers) {
		for (Object number : numbers) {
			System.out.print(numbers+"  ");
		}
		System.out.println("");
	}
}

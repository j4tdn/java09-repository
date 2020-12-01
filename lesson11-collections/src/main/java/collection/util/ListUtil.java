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
}

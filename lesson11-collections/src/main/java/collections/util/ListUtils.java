package collections.util;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}

	public static void printfStr(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void printfInt(List<Integer> elements) {

		for (int element : elements) {
			System.out.print(element + "  ");
		}
		System.out.println();

	}
}

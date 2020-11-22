package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {

	}

	public static void printf(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}
}

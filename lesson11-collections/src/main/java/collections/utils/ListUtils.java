package collections.utils;

import java.util.List;

public class ListUtils {

	public static void printf(List<String> sequences) {
		for (String s : sequences) {
			System.out.print(s + "  ,  ");
		}
	}
}

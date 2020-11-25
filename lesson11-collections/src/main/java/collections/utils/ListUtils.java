package collections.utils;

import java.util.List;

public class ListUtils {

	public static void printfString(List<String> sequences) {
		for (String s : sequences) {
			System.out.print(s + "  ,  ");
		}
	}
	public static void printfInt(List<Integer> numbers) {
		for (int num: numbers) {
			System.out.print(num + "  ,  ");
		}
		System.out.println();
	}
}

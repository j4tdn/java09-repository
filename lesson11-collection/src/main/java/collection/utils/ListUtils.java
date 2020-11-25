package collection.utils;

import java.util.List;

public class ListUtils {
	private  ListUtils() {
		
	}
	
	public static void prinfStr(List<String> elements) {
		for ( String element:elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void prinfInt(List<Integer> elements) {
		for ( Integer element:elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	
}

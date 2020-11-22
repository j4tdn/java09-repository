package collections.utils;

import java.util.List;

public class ListUtils {
	private ListUtils() {
		
	}
	
	public static void printf(List<String> sequences) {
		for(String item : sequences) {
			System.out.println(item);
		}
	}
}

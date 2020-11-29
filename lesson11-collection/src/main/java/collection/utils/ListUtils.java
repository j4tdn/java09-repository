package collection.utils;

import java.util.List;

public class ListUtils {
	private  ListUtils() {
		
	}
	
	//generic method
	//E: generic type => object (compiler)
	//					  Integer,String...runtime	
	
	public static <E> void prinf(List<E> elements) {
		for (E element:elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	
}

package collection.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtils {
	private  CollectionUtils() {
		
	}
	
	//generic method
	//E: generic type => object (compiler)
	//					  Integer,String...runtime	
	
	public static <E> void prinf(Collection<E> elements) {
		for (E element:elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static  void printfwc(List<? super Number> elements) {
		for (Object element:elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
}

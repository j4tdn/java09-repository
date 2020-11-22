package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		//generic type
		// generic: definition of object type 
		List<Integer> digits = new ArrayList<>();
		digits.add(1);
		digits.add(2);
		//digits.add("hello"); catch error at compile 
		
		// List versus List<E> 		
		// List catch error at runtime, List<E> catch error at   compile
		//List = List<Object>
		
		System.out.println(digits);
		
	}

}

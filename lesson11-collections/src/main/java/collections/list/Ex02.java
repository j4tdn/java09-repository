package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		// generic type
		// generic definition of object type
		List<Integer> digits = new ArrayList<>();
		digits.add(1);
		digits.add(2);
		// catch error at compile
		// List versus List<E>
		// List = List<Object>
		
		for (Integer integer : digits) {
			System.out.print(integer + " ");
		}
		
		
	}
}

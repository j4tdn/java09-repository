package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		//generic type
		//generic :definition of object type
		List<Integer> digits=new ArrayList<>();
		digits.add(1);
		digits.add(2);
		System.out.println(digits);
		//catch error at compile
		//list v list<E>
		//LIST =LIST<OBJECT>
	}

}

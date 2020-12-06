package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collections.utils.CollectiontUtils;

public class Ex01 {
	public static void main(String[] args) {
		//Set<Integer> digits = new HashSet<>();
		//Set<Integer> digits = new LinkedHashSet();
		Set<Integer> digits = new TreeSet();


		digits.add(13);
		digits.add(27);
		digits.add(18);
		digits.add(42);

		
		CollectiontUtils.printf(digits);
		
		
	}

}

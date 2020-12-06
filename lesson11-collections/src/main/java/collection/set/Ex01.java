package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collections.util.ListUtils;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> digits=new TreeSet<Integer>();
		digits.add(27);
		digits.add(28);
		digits.add(27);
		digits.add(42);
		digits.add(27);
		digits.add(13);
		ListUtils.printf(digits);
		
		
	}
	
}

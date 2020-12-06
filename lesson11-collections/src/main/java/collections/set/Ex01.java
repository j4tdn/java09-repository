package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import collections.utils.ListUtils;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> digits=new HashSet<>();
		digits.add(13);
		digits.add(27);
		digits.add(18);
		digits.add(42);
		ListUtils.print(digits);
	}
}

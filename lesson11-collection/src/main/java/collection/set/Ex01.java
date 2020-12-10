package collection.set;

import java.util.HashSet;
import java.util.Set;

import collection.utils.CollectionUtils;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> digits = new HashSet<>();
		digits.add(13);
		digits.add(27);
		digits.add(18);
		digits.add(27);
		digits.add(42);
		CollectionUtils.prinf(digits);
	}

	
}

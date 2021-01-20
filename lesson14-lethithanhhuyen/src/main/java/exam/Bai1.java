package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Bai1 {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,2,3,4,5,6,6,7,8,9,2,3);
		List<Integer> result = manyNumber(digits);
		result.forEach(System.out::println);
	}
	
	private static List<Integer> manyNumber(List<Integer> digits) {
		List<Integer> result = new ArrayList<>();
		List<Integer> newDigits = digits.stream()
									.sorted()
									.collect(Collectors.toList());
		for (int i=1; i<newDigits.size()-1; i++) {
			if(newDigits.get(i) == newDigits.get(i+1) || newDigits.get(i) == newDigits.get(i-1)) {
				if (result.size()==0) {
					result.add(newDigits.get(i));
				} else
				if(newDigits.get(i) != result.get(result.size()-1)) {
					result.add(newDigits.get(i));
				}
			}
		}
		return result;	
	}
	
	private static List<Integer> uniqueNumber(List<Integer> digits) {
		List<Integer> result = new ArrayList<>();
		List<Integer> newDigits = digits.stream()
									.sorted()
									.collect(Collectors.toList());
		for (int i=1; i<newDigits.size()-1; i++) {
			if(newDigits.get(i) != newDigits.get(i+1) || newDigits.get(i) != newDigits.get(i-1)) {
					result.add(newDigits.get(i));
			}
			if (newDigits.get(0) != newDigits.get(i+1)) {
				result.add(newDigits.get(0));
			}
			if (newDigits.get(newDigits.size()-1) != newDigits.get(newDigits.size()-2)) {
				result.add(newDigits.get(newDigits.size()-1));
			}
		}
		return result;	
	}
}

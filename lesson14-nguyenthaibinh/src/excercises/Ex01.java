package excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {
				1,2,3,4,5,6,5,5,3,1
		};
		System.out.println("Unique Number in Array");
		ArrayUtils.printf(selectUniqueElements(numbers));
		System.out.println();
		System.out.println("Element Appear More Than One Time");
		ArrayUtils.printf(selectElementAppearMoreThanOneTime(numbers));
		
	}
	
	private static int[] selectUniqueElements(int[] numbers) {
		int[] result = Arrays.stream(numbers).distinct().toArray();
		return result;
	}
	private static List<Integer> selectElementAppearMoreThanOneTime(int[] numbers) {
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			if(isElementAppearMoreThanOneTime(numbers, numbers[i])) {
				result.add(numbers[i]);
			}
		}
		return result.stream().distinct().collect(Collectors.toList());
	}
	private static boolean isElementAppearMoreThanOneTime(int[] numbers, int element) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(element == numbers[i]) {
				count++;
			}
		}
		if(count >= 2) {
			return true;
		}
		return false;
	}
}

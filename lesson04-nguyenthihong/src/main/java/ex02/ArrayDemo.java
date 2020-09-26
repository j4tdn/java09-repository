package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 19, 10, 21, 14);
		List<Integer> result = arrangeArray(list);
		for (Integer num : result) {
			System.out.print(num + "   ");
		}
	}

	public static List<Integer> arrangeArray(List<Integer> list) {

		List<Integer> divisibleBy5 = new ArrayList<Integer>();
		List<Integer> otherNumber = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (Integer num : list) {
			if (num % 7 == 0) {
				result.add(num);
			} else if (num % 5 == 0) {
				divisibleBy5.add(num);
			} else {
				otherNumber.add(num);
			}
		}

		result.addAll(otherNumber);
		result.addAll(divisibleBy5);
		return result;
	}
}

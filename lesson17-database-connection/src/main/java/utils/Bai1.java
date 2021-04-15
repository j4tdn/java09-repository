package utils;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai1 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 2,1 };
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < digits.length; i++) {
			addElement(map, digits[i]);
		}
		System.out.print("result: ");
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}else System.out.println("EMPTY");
		}
	}

	public static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}
}

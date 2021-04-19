package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03 {
	static Scanner sc;
	static Long result = 0L;
	
	static int n1;
	static int n2;
	static int n3;
	static int n4;
	
	static List<Integer> a;
	static List<Integer> b;
	static List<Integer> c;
	static List<Integer> d;
	static List<Integer> uniqueNumbers = new ArrayList<>();
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		a = new ArrayList<>(n1);
		b = new ArrayList<>(n2);
		c = new ArrayList<>(n3);
		d = new ArrayList<>(n4);
		
		getInputArray(a, n1);
		getInputArray(b, n2);
		getInputArray(c, n3);
		getInputArray(d, n4);
		
		Map<Integer, Long> groupByA = a.stream().collect(Collectors.groupingBy(number -> number, 
				Collectors.counting()));
		Map<Integer, Long> groupByB = b.stream().collect(Collectors.groupingBy(number -> number, 
				Collectors.counting()));
		Map<Integer, Long> groupByC = c.stream().collect(Collectors.groupingBy(number -> number, 
				Collectors.counting()));
		Map<Integer, Long> groupByD = d.stream().collect(Collectors.groupingBy(number -> number, 
				Collectors.counting()));
		
		
		uniqueNumbers.forEach(number -> {
			Long count1 = groupByA.get(number) == null ? 0L : groupByA.get(number);
			Long count2 = groupByB.get(number) == null ? 0L : groupByB.get(number);
			Long count3 = groupByC.get(number) == null ? 0L : groupByC.get(number);
			Long count4 = groupByD.get(number) == null ? 0L : groupByD.get(number);
			
			result += (count1 * count2 * count3 * count4) % 1000;
		});
		
		System.out.println(result);
	}

	private static void getInputArray(List<Integer> array, int amount) {
		for (int i = 0; i < amount; i++) {
			int number = sc.nextInt();
			array.add(number);
			if (!uniqueNumbers.contains(number)) {
				uniqueNumbers.add(number);
			}
		}
	}
}

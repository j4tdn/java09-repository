package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test04 {
	
	static List<Integer> numberList;
	static Integer maxNumber = 0;
	static Long maxCounter = 0L;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		numberList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			numberList.add(sc.nextInt());
		}
		
		Map<Integer, Long> countions = numberList.stream().collect(Collectors.groupingBy(number -> number, 
				Collectors.counting()));
		
		countions.forEach((key, value) -> {
			if (value > maxCounter) {
				maxNumber = key;
				maxCounter = value;
			}
		});
		
		System.out.println(maxNumber);
	}
}

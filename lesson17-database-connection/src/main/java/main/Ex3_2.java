package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3_2 {
	static Scanner sc;
	static Long result = 0L;
	
	static int n1;
	static int n2;
	static int n3;
	static int n4;
	
//	static List<Integer> a;
//	static List<Integer> b;
//	static List<Integer> c;
//	static List<Integer> d;
	static List<Integer> uniqueNumbers = new ArrayList<>();
	
	static int[] checkpointA = new int[101];
	static int[] checkpointB = new int[101];
	static int[] checkpointC = new int[101];
	static int[] checkpointD = new int[101];
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		getInputArray(checkpointA, n1);
		getInputArray(checkpointB, n2);
		getInputArray(checkpointC, n3);
		getInputArray(checkpointD, n4);
		
		
		uniqueNumbers.forEach(number -> {
			result += ((checkpointA[number] * checkpointB[number] * checkpointC[number] * checkpointD[number]));
		});
		
		System.out.println(result % 1000);
	}

	private static void getInputArray(int[] array, int amount) {
		for (int i = 0; i < amount; i++) {
			int number = sc.nextInt();
			array[number]++;
			if (!uniqueNumbers.contains(number)) {
				uniqueNumbers.add(number);
			}
		}
	}
}

package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = 1;
		System.out.print("Nhap n:");
		n = scanner.nextInt();
	    ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList <Integer> list2 = new ArrayList<Integer>();

		for (int i = 1; i <= (n + 1); i++) {
			list2.clear();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					list2.add(1);
				} else {
					list2.add(list1.get(j - 1) + list1.get(j));
				}
			}
			list1 = new ArrayList<Integer>(list2);
			list1.forEach(number -> System.out.printf("%-5d", number));
			System.out.println();
		}
	}
}

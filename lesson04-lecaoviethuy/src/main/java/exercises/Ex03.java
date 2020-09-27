package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		int n = 4;
		List<Integer> arr1 = null;
		List<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i = 1; i <= (n + 1); i++) {
			arr2.clear();
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					arr2.add(1);
				} else {
					arr2.add(arr1.get(j - 1) + arr1.get(j));
				}
			}
			arr1 = new ArrayList<Integer>(arr2);
			arr1.forEach(number -> System.out.printf("%-5d", number));
			System.out.println();
		}
	}
}

package immutable;

import java.io.ObjectInputStream.GetField;

public class Ex05 {
	// viet ctr in ra cac so xuat hien 1 lan trong chuoi
	// String s = "1,1,2,3,4,2,4,5,50"
	// get unit number

	public static void main(String[] args) {
		// viet ctr in ra cac so xuat hien 1 lan trong chuoi
		// String s = "1,1,2,3,4,2,4,5,50"
		//cach 2: item:value,qty
		//item[] items
	
		String input = "1,2,2,3,3,4,5";
		System.out.println(getUniqueNbers(input));
	}

	private static String getUniqueNbers(String input) {
		StringBuilder result = new StringBuilder();
		String[] numbers = input.trim().split(",");
		boolean[] flags = new boolean[numbers.length]; // default: false
		for (int out = 0; out < numbers.length; out++) {
			if (!flags[out]) {
				for (int in = out+1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;

					}
				}
			}
			if (!flags[out]) {
				result.append(numbers[out] + ",");
			}
		}

		return result.toString();
	}
}

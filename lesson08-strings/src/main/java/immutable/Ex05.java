package immutable;

import java.util.function.Function;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.*;

import java.util.Map;

public class Ex05 {
	// Get unique numbers: 1 2 3 2 => 1 3
	// Get distinct numbers: 1 2 3 2 => 1 2 3
	
	// Item: value, qty
	// Item[] items
	public static void main(String[] args) {
		String input = "1, 2, 2, 2, 2, 3, 15";
		
		// JAVA08
		Pattern.compile(", ").splitAsStream(input)
			.collect(groupingBy(Function.identity(), counting()))
			.entrySet().forEach(System.out::println);
		
		// input.indexOf(array[i])  => a
		// input.lastIndexOf(array[i]) => b
		// a == b ? unique : non X
		// 1 2 2 2 2 2 3 15: []
		
		
		System.out.println(getUniqueNbers(input));
	}
	
	private static String getUniqueNbers(String input) {
		StringBuilder result = new StringBuilder();
		String[] numbers = input.trim().split(", ");
		// default: false
		boolean[] flags = new boolean[numbers.length];
		for(int out = 0; out < numbers.length; out++) {
			if (!flags[out]) {
				for (int in = out + 1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
			}
			if (!flags[out]) {
				result.append(numbers[out] + ", ");
			}
		}
		return result.toString();
	}
}

package immutable;

import java.util.regex.Pattern;

public class Ex05 {
	// get unique numbers: 1 2 3 2 => 1 3
	// get distinct numbers: 1 2 3 2 => 1 2 3
	
	
	//Item: value, qty
	//Item[] items
	public static void main(String[] args) {
		String s = "1, 2, 3, 2";
		System.out.println(getUniqueNumbers(s));
	}

	private static StringBuilder getUniqueNumbers(String input) {
		StringBuilder result = new StringBuilder();
		
		String[] numbers = input.trim().split(", ");
		
		//default: false
		boolean[] flags = new boolean[numbers.length];
		
		for(int out = 0; out < numbers.length; out++) {
			if(flags[out] == false) {
				for(int in = out + 1; in <numbers.length ; in++) {
					if(numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
				
			}
			
			if(flags[out] == false) {
				result.append(numbers[out] + " ");
			}			
		}
		
		
		
		/*for(String out: numbers) {
			int count = 0;
			for(String in: numbers) {
				if(out.equals(in)) {
					count ++;
					if( count == 2) {
						break;
					}
				}
			}
			if(count == 1) {
				result += out + " ";
			}
		} */
		
		return result;
	}
}

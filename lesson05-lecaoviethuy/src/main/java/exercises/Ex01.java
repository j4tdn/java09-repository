package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {3, 15, 21, 0, 15, 17, 21};
		int[] uniqueNumbers = getUniqueNumbers(numbers);
		
		Arrays.sort(uniqueNumbers);
		for(int number : uniqueNumbers) {
			System.out.printf("%-5d", number);
		}
	}

	private static int[] getUniqueNumbers(int[] numbers) {
		List<Integer> tmp = new ArrayList<>();
		boolean[] isDuplicatedNumber = new boolean[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			if(!isDuplicatedNumber[i]) {
				for(int j = 0; j < numbers.length; j++) {
					if(j != i && numbers[j] == numbers[i]) {
						isDuplicatedNumber[i] = isDuplicatedNumber[j] = true; 
					}
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(!isDuplicatedNumber[i]) {
				tmp.add(numbers[i]);
			}
		}
		return tmp.stream().mapToInt(i -> i).toArray();
	}
}

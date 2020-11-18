package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import javax.naming.spi.DirStateFactory.Result;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int sum = sum(digits, t -> t % 2 !=0);
		DigitDto result = getMaxMin(digits);
		int[] addedArray = add(digits, 99, 3);
		int[] removedArray = remove(digits, 3);
		
		System.out.println("sum: " +sum);
		System.out.println("max: " +result.getMax());
		System.out.println("min: " +result.getMin());
		System.out.println("===add===");
		iterate(addedArray);
		System.out.println("===remove===");
		iterate(removedArray);
		System.out.println("===sort===");
		//sort(digits);
		Arrays.sort(digits);
		reverse(digits);
		iterate(digits);
	}
	
	//a, calculate sum of add numbers
	
	private static int sum(int[] digits, Predicate<Integer> predicate) {
	 if (digits.length == 0) {
		 return 0;
	 }
		int sum = 0;
		for (int i =0; i < digits.length ; i++) {
			if(predicate.test(digits[i])) {
				sum += digits[i];
			}
		}
	 
	 return sum;

	}
	//b, Find max, min in one loop
private static DigitDto getMaxMin(int[] digits) {
	
	if (digits == null || digits.length == 0) {
		throw new IllegalArgumentException();
	}
	
	DigitDto result = new DigitDto();
	result.setMax(digits[0]);
	result.setMin(digits[0]);
	
	for (int digit: digits) {
		if (digit > result.getMax()) {
			result.setMax(digit);
		}
		if(digit < result.getMin()) {
			result.setMin(digit);
		}
	}
	
	return result;
}

	//c. add element into array
private static int[] add(int[] digits, int newValue, int index) {
	index = index < 0 ? 0 : index;
	index = index >= digits.length ? digits.length : index;
	int[] result = new int[digits.length + 1];
	for (int i =0;  i< index; i++) {
		result[i] = digits[i];
	}
	
	result[index] = newValue;
	for (int i = index; i<digits.length; i++) {
		result[i + 1] =digits[i];
	}
	return result;
}

	//D. REMOVE anelement into array
private static int[] remove(int[] digits, int index) {
	int[] result= new int[digits.length-1];
	for (int i = 0; i< index; i++) {
		result[i] = digits[i];
		}
	for(int i = index; i < result.length; i++) {
		result[i] = digits[i+1];
	}
	return result;
}
//E: sort an array
private static void sort(int[] digits) {
	for (int i = 0; i < digits.length-1;i++) {
		for (int j = i + 1; j < digits.length; j++) {
			if(digits[i] > digits[j]) {
				int tmp = digits[i];
				digits[i] = digits[j];
				digits[j] = tmp;
			}
		}
	}
}

//f. reverse array
private static void reverse(int[] digist) {
	
			for ( int i = 0; i < digist.length/2; i++) {
				int tmp = digist[i];
				digist[i] = digist[digist.length -i - 1];
				digist[digist.length -i - 1] = tmp;
			}
}
//iteration: foreIndex, forEach
private static void iterate(int[] digits) {

	for (int digit : digits) {
		System.out.println(digit + " ");
	}
	System.out.println();
}
}

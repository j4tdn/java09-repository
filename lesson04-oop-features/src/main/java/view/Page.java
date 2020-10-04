package view;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Page {
	public static void main(String[] args) {
		int[] numbers = {1,2,8,4,11,6}; 
		//Condition condition = (a) -> a % 2 == 0;
		int[] result = filter(numbers,(a) -> a % 2 == 0 );
		loop(result,(number) -> System.out.println(number));
	}

	private static void loop(int[] numbers, Performer performer) {
		for(int number: numbers) {
			performer.perform(number);
		}
	}
	
	private static int[] filter(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int length = 0;
		for(int number:numbers) {
			if(condition.test(number)) {
				result[length++] = number;
			}
		}
		return Arrays.copyOfRange(numbers, 0, length);
	}
}

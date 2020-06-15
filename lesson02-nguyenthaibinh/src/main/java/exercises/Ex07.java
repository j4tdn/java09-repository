package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] number = random(5);
		for(int i = 0;i < number.length;i++) {
			System.out.println(number[i]);
		}
	}
	public static int[] random(int length) {
		int[] array = new int[length];
		Random rd = new Random();
		while(length > 0) {
			int number = 20 + rd.nextInt(11);
			if(contain(array,length, number)) {
				array[array.length - length] = number;
				length--;
			}
		}
		return array;
	}
	public static boolean contain(int[] numbers, int index, int number) {
		for(int i = 0;i < numbers.length - index; i++) {
			if(numbers[i] == number) {
				return false;
			}
		}
		return true;
	}
}

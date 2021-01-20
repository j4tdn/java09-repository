package ex01;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Ex01 {
	public static void main(String[] args) {
//       xuat hien 1 lan 2 4 6
		int[] number = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		int[] result = appearedOnceNumbers(number);
		Arrays.stream(result).forEach(System.out::println);
		System.out.println("=============");
//      xuat hien nhieu lan 7 9 
		int[] numbers = { 5, 7, 9, 10, 20, 9, 7, 11 };
		int[] result1= appearedOnceNumbers(numbers);
		Arrays.stream(result1).forEach(System.out::println);

	}
	private static int[] appearedOnceNumbers( int[] numbers)
	{
		int [] result= new int[numbers.length];
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			for(int j=i+1;j<numbers.length;j++) {
			if (numbers[i]==numbers[j]) {
				 result[count++] = numbers[i];
			}
		}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
}

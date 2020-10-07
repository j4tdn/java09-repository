package funtionlinterface;

import java.util.Arrays;

public class ArrayProcessing {

		public static void main(String[] args) {
			int[] numbers = {1, 2, 3, 4, 5, 6, 7};
			int[] oddNumbers = findNumber(numbers, number -> number % 2 == 0 );
			int[] powerNumber = findNumber(numbers,number -> number % 5 == 0 );
			
		//Condition con = new Condition() {
			
		//	@Override
		//	public boolean test(int a) {
				
		//		return a % 2 == 0;
		//	}
		//};
			
			fotEach("print even number",oddNumbers );
			fotEach("print power number",powerNumber );
		}
			private static void fotEach(String title, int[] numbers) {
				System.out.println(title);
				for (int number: numbers) {
					System.out.println("number: "+ number );
				}
			}
		private static int[] findOddNumber(int[] numbers) {
			int[] result =new int[numbers.length];
			int k=0;
			for (int number: numbers) {
				if(number % 2!=0) {
					result[k++]=number;
				}
			}
			return Arrays.copyOfRange(result, 0, k);
		}
		private static int[] findEvenNumber(int[] numbers) {
			int[] result =new int[numbers.length];
			int k=0;
			for (int number: numbers) {
				if(number % 2 == 0) {
					result[k++]=number;
				}
			}
			return Arrays.copyOfRange(result, 0, k);
		}
		//strategy pattern
		private static int[] findNumber(int[] numbers, Condition condition) {
			int[] result =new int[numbers.length];
			int k=0;
			for (int number: numbers) {
				if(condition.test(number)) {
					result[k++]=number;
				}
			}
			return Arrays.copyOfRange(result, 0, k);
		}
				}

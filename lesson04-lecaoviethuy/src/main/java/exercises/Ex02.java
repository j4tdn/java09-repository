package exercises;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {3, 5, 7, 10, 15, 28, 29, 100, 70, 6, 90, 21, 56, 49, 35, 66, 20};
		int firstIndex = 0;
		int lastIndex = numbers.length - 1;
		
		for(int i = 0; i <= lastIndex; i++) {
			if(numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
				System.out.println(numbers[i] + ", " + i + ", " + lastIndex);
				swap(firstIndex, i, numbers);
				firstIndex++;
			} else if(numbers[i] % 5 == 0 && numbers[i] % 7 != 0) {
				swap(lastIndex, i, numbers);
				lastIndex--;
				i--;
			}
		}
		
		System.out.println("Chuoi sau khi xu ly:");
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d", numbers[i]);
		}
	}

	private static void swap(int i, int j, int[] numbers) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}
}

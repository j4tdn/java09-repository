package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 3, 2, 1, 6, 5 };
		int[] nums = new int[] { 3, 7, 9, 2, 1, 6, 5, 4, 10 };

		System.out.println(getMissingNumber(nums));
		System.out.println(getMissingNumber(numbers));

	}

	private static int getMissingNumber(int[] numbers) {
		int sumOfNumbers = 0;
		for (int num : numbers) {
			sumOfNumbers += num;
		}
		int sum = 0;
		for (int i = 1; i <= numbers.length + 1; i++) {
			sum += i;
		}
		return sum - sumOfNumbers;
	}

}

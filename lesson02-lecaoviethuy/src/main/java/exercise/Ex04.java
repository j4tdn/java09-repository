package exercise;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int firstOdd = 0;
		int secondOdd = 0;

		for (int number : numbers) {
			if (isOdd(number)) {
				if (number > firstOdd) {
					secondOdd = firstOdd;
					firstOdd = number;
				} else {
					if (number > secondOdd) {
						secondOdd = number;
					}
				}
			}
		}

		if (secondOdd == 0) {
			System.out.println("Không có số lẻ lớn thứ 2 trong dãy!");
		} else {
			System.out.println("Số lẻ lớn thứ 2 trong dãy là: " + secondOdd);
		}
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}

package exercise;

public class Ex03 {
	public static void main(String[] args) {
		long number = 1234554321L;
		long reverseNumber = reverse(number);
		if (number == reverseNumber) {
			System.out.println(number + " là số đối xứng!");
		} else {
			System.out.println(number + " không là số đối xứng!");
		}
	}

	private static long reverse(long number) {
		long result = 0;
		while (number != 0) {
			result = result * 10 + (number % 10);
			number /= 10;
		}

		return result;
	}
}

package exercise;

public class Ex06 {
	public static void main(String[] args) {
		int i = 200;
		int number = 1;
		while (i != 0) {
			if (isPrime(number)) {
				i--;
			}
			number++;
		}

		System.out.println("Số nguyên tố thứ 200 là: " + (number - 1));
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}

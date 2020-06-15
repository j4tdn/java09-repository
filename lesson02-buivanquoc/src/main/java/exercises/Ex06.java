package exercises;

public class Ex06 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i)) {
				count++;
			}
			if (count == 200) {
				System.out.println("so nguyen to thu 200:" + i);
				break;
			}

		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;

			}
		}

		return true;

	}
}

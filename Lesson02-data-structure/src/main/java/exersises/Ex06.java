package lesson02;

public class Prime {
	public static void main(String[] args) {
		int count = 0, n;
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

	public static boolean isPrime(int n) {
		int count = 0;
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				count++;

		}
		if (count == 0)
			return true;
		return false;

	}

}

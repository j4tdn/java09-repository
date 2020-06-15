package exercise01;

public class Ex06 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (true) {
			if (isPrime(i)) {
				count++;
			}
			if (count == 200) {
				System.out.println("Prime index 200 is value:" + i);
				break;
			}
			i++;
		}
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}

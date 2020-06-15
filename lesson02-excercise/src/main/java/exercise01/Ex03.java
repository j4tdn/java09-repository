package exercise01;

public class Ex03 {
	public static void main(String[] args) {
		int n = 15551;
		if (isSymmetric(n)) {
			System.out.println("This is symmetric number!");
		} else {
			System.out.println("This is not symmetric number!");
		}
	}

	private static boolean isSymmetric(int n) {
		int sum = 0, temp = 0, var = n;
		while (n != 0) {
			temp = n % 10;
			n /= 10;
			sum = sum * 10 + temp;
		}
		return sum == var;
	}
}

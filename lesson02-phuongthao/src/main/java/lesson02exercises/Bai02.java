package lesson02exercises;

//Bai 2: S=4!+7!+12!+18!

public class Bai02 {
	public static void main(String[] args) {
		// int a=4, b=7, c=12, d=18;

		System.out.println("Sum S=4!+7!+12!+18!=" + (giaithua(4) + giaithua(7) + giaithua(12) + giaithua(18)));

	}

	private static int giaithua(int n) {
		int i = 1;
		int P = 1;
		for (i = 1; i <= n; i++) {
			P = P * i;
		}
		return P;

	}
}
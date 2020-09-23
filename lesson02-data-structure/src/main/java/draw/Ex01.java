package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx01(5);
		drawEx02(6);
		drawEx03(6);
		drawEx04(6);
	}

	private static void drawEx01(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}

	private static void drawEx02(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("*");
		}
	}

	private static void drawEx03(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

	private static void drawEx04(int n) {
		int a = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for (int i = 1; i < n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (a < n) {
				for (int k = 1; k <= a * 2 + 1; k++) {
					System.out.print(" ");
				}
				for (int q = 1; q <= 1; q++) {
					System.out.println("*");
				}
			}
			a++;
		}
		System.out.print("*");
		for (int i = 0; i < n; i++) {
			System.out.print(" *");
		}
	} 
}

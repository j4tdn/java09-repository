package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx04(5);
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
			for (int j = 1; j <= n ; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void drawEx04(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n ; j++) {
				if (j == n - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

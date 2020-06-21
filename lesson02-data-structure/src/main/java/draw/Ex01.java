package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx01(5);
		drawEx02(5);
		System.out.println();
		drawEx03(5);
		System.out.println();
		drawEx04(5);

	}

	private static void drawEx01(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static void drawEx02(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					System.out.println("*");
				}
			}
		}

	}

	private static void drawEx03(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i) {
					System.out.print(" ");
				}
				if (i == j) {
					System.out.println("*");
				}

			}
		}

	}

	private static void drawEx04(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				}
				if (i == j) {
					System.out.println("*");
				}

			}
		}

	}
}

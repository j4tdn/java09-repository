package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx01(5);
		System.out.println("\n");
		drawEx02(5);
		System.out.println("\n");
		drawEx03(5);
		System.out.println("\n");
		drawEx04(5);
	}

	private static void drawEx01(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}

	private static void drawEx02(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	private static void drawEx03(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

	private static void drawEx04(int n) {
		for (int i = 0; i < n; i++) {
			for (int j=n;j>i;j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}

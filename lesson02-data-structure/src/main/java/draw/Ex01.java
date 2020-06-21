package draw;

public class Ex01 {
	public static void main(String[] args) {
		 drawEx01(7);
		 drawEx02(6);
		drawEx03(5);
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
		//System.out.println("=====================");
	}

	private static void drawEx03(int n) {
		for (int i = 0; i < n; i++) {
//			System.out.println("*");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		// System.out.println();
	}

	private static void drawEx04(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = n - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		// System.out.println("===================");
	}
}

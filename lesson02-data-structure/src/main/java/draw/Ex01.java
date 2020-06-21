package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEX04(5);
	}

	private static void drawEX01(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}

	}

	private static void drawEX02(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("*");
		}
	}

	private static void drawEX03(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

	private static void drawEX04(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}

			
				System.out.println("*");
			}
		}

	}

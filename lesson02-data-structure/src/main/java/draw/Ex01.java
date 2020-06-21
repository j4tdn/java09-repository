package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx01(4);
		drawEx02(4);
		drawEx03(4);
		drawEx04(4);
	}
	
	private static void drawEx01(int n) {
		for(int i = 0; i < n; i++) {
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
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >= 1; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}

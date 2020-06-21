package draw;

public class Ex01 {
	public static void main(String[] args) {
		drawEx01(5);
		drawEx02(5);
		drawEx03(5);
		drawEx04(5);
	}
	
	private static void drawEx01(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	private static void drawEx02(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}
	
	private static void drawEx03(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	private static void drawEx04(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}

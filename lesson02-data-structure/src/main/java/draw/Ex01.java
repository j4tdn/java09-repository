package draw;

public class Ex01 {
	public static void main(String[] args) {
		Ex01(6);
		Ex02(6);
		Ex03(5);
		Ex04(5);
	}
	private static void Ex01(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
	}
	private static void Ex02(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("*");
		}
	}
	private static void Ex03(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	private static void Ex04(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}

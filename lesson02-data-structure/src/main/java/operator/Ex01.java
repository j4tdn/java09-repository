package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a=15;
		if (!isEven(a)) {
			System.out.println("odd");
		}else {
		System.out.println("Even");
	}
	}
	private static boolean isEven(int a) {
		return a % 2 == 0;
	}
}


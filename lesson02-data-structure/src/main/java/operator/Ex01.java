package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 7;
		if (isEven(a)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}

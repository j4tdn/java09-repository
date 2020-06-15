package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 7;
		if (isEven(a)) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	private static boolean isEven(int a) {
		return a % 2 == 0;
	}

}



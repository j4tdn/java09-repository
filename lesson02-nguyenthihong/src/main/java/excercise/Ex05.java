package excercise;

public class Ex05 {
	// Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10
	// thành số ở hệ cơ số 2
	public static void main(String[] args) {
		int a = 10;
		System.out.println(convertToBinary(a));
	}

	public static String convertToBinary(int a) {
		String result = "";
		int a_fake = a;
		while (a_fake > 0) {
			int surplus = a_fake % 2;
			result = result + surplus;
			a_fake /= 2;
		}
		return new StringBuffer(result).reverse().toString();
	}
}

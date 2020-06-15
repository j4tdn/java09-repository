package excercise;

public class Ex03 {
	// Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
	public static void main(String[] args) {
		int a = 6886;

		if (isSymmetry(a)) {
			System.out.println(a + " là số đối xứng");
		} else {
			System.out.println(a + " không là số đối xứng");
		}

	}

	public static boolean isSymmetry(int a) {
		int sum = 0;
		int a_fake = a;
		while (a_fake % 10 != 0) {
			int surplus = a_fake % 10;
			sum = sum * 10 + surplus;
			a_fake /= 10;
		}
		if (sum == a) {
			return true;
		}
		return false;
	}
}

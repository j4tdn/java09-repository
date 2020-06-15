package exercises;

public class Ex03 {
	public static void main(String[] args) {
		if (isSymmetricNumber(121)) {
			System.out.println("Day la so doi xung");
		} else {
			System.out.println("Khong phai so doi xung");
		}
	}

	public static boolean isSymmetricNumber(int params) {
		int tmp = 0;
		int result = params;
		while (result > 0) {
			tmp *= 10;
			tmp += result % 10;
			result /= 10;
		}
		if (tmp == params) {
			return true;
		}
		return false;
	}
}

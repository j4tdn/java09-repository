package exercises;

public class Ex05 {
	public static void main(String[] args) {
		String number = radix(2);
		System.out.println(number);
	}
	public static String radix(int params) {
		String result = "";
		while(params > 0) {
			result = String.valueOf(params % 2) + result;
			params /= 2;
		}
		return result;
	}
}

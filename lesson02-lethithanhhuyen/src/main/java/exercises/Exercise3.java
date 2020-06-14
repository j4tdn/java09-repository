package exercises;

public class Exercise3 {
	public static void main(String[] args) {
		int a=121;
		if (SoDX(a)) {
			System.out.println("Đây là số đối xứng");
		} else {
			System.out.println("Đây không phải là số đối xứng");
		}
	}
	public static boolean SoDX(int a) {
		int b = 0, c = a;
		while (a > 0) {
			b = b*10 + a%10;
			a=a/10;
		}
		return b==c;
	}
}

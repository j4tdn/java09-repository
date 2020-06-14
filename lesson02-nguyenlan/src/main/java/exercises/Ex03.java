package exercises;

public class Ex03 {
	public static void main(String[] args) {
		long a = 1234321;
		long tmp;
		tmp = a;
		long result = 0; 
		while (tmp != 0) {
			result = result * 10 + (tmp % 10);
			tmp = tmp / 10;
		}
		if (result == a) {
			System.out.println("là số đối xứng");
		} else {
			System.out.println("không là số đối xứng");
		}
	}
}

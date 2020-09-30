package exercises;

public class Ex03 {
	public static void main(String[] args) {
		int a = 12, b = 2;
		System.out.println(a + (isPowerOf(a, b) ? " co " : " khong ") + "la luy thua cua " + b);
		
	}
	
	public static boolean isPowerOf(int a, int b) {
		while(a > b) {
			a /= b;
		}
		return a % b == 0;
	}
}

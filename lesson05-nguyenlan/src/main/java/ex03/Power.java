package ex03;

public class Power {
	public static boolean isPowerOf(int a, int b) {
		int tmp = b;
		int i = 1;
		while(tmp <= a) {
			tmp = (int) Math.pow(b, i);
			if(tmp == a) {
				return true;
			}
			i++;		
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
	}
}

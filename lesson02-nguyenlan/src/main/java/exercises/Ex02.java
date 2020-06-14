package exercises;

public class Ex02 {
	public static void main(String[] args) {
		long sum = fact(4) + fact(7) + fact(12) + fact(18);
		System.out.println("4! + 7! + 12! + 18! = " + sum);
	}
	public static long fact(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return n*fact(n-1);
	}
}

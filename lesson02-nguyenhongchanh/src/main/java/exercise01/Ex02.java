package exercise01;

public class Ex02 {
	public static void main(String[] args) {
		long s = giaithua(4) + giaithua(7) + giaithua(12) + giaithua(18);
		
		System.out.println("4! + 7! + 12! + 18! = " + s);
		
	}
	
	private static long giaithua(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n*giaithua(n-1);
		}
	}

}

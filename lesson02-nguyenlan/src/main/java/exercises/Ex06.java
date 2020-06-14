package exercises;

public class Ex06 {
	public static void main(String[] args) {
		long i = 1, dem = 0, n = 7 ;
		while (dem != n) {
			i++;
			if (prime(i) == true) {
				dem++;
			}
		}
		System.out.println("số nguyên tố thứ " + n + " là " + i);
	}
	
	public static boolean prime(long n) {
		if (n <2) return false;
		if (n == 2 || n == 3) return true;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}

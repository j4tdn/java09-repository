package exercises;

public class Ex06 {
	public static void main(String[] args) {
		timSNTThu200();
	}
	
	public static void timSNTThu200() {
		long i = 2;
		int dem = 0;
		while(true) {
			if (kiemTraSNT(i) == true) {
				dem ++ ;
				if (dem == 200) {
					System.out.println("So nguyen to thu 200 la : " + i);
					break;
				}
			}
			i ++ ;
		}
	}
	
	public static boolean kiemTraSNT(long n) {
		int check = 1;
		if (n == 2 || n == 3)
			return true;
		else {
			for (long i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					check = 0;
					break;
				}
			}
		}
		if (check == 0)
			return false;
		else
			return true;
	}
}
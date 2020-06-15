package exercise01;

public class Ex06 {
	public static void main(String[] args) {
		int r=0;
		int n=1;
		while (r!=200) {
			n++;
			if (kiemtra(n)) {
				r++;
			}
		}
		
		System.out.println(n);
		
	}
	
	public static boolean kiemtra(int n) {
		int r=0;
		for (int i= 1; i< n+1; i++) {
			if (n%i == 0) {
				r++;
				if (r>2) {
					return false;
				}
			}
		}
		return true;
	}
}

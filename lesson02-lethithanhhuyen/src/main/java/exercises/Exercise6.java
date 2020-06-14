package exercises;

public class Exercise6 {
	public static void main(String[] args) {
		int dem=2, i=1;
		while (dem <200) {
			i++;
			if (SoNgTo(i)) dem++;
		}
		System.out.println(i);
	}
	public static boolean SoNgTo(int a) {
		if (a==0 || a==1) return false;
		for (int i=2; i<= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}

package exercises;

public class Exercise2 {
	public static void main(String[] args) {
		long s= GiaiThua(4) + GiaiThua(7) + GiaiThua(12) + GiaiThua(18) ;
		System.out.println("S = " + s);
	}
	public static long GiaiThua(int a) {
		long gt=1;
		if (a == 0 || a == 1) return gt;
		for (int i=1; i<=a; i++)
			gt=gt*i;
		return gt;
	}
}

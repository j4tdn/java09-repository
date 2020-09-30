package ex04;

public class LeastCommonMultiple {
	public static int getLeastCommonMultiple(int a, int b) {
		int a1 = a, b1 = b;
		if(a == 0 || b == 0) {
			System.out.println("không có Bội chung nhỏ nhất giữa " + a + " và " + b);
			return -1;
		}
		//tìm ƯCLN của a và b trả về a1;
		while(a1 != b1) {
			if(a1 > b1) {
				a1 -= b1; 
			} else {
				b1 -= a1;
			}
		}
		int BCNN;
		BCNN = a * b / a1;
		return BCNN;
	}
	public static void main(String[] args) {
		System.out.println(getLeastCommonMultiple(12, 20));
	}
}

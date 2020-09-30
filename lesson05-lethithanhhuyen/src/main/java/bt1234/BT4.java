package bt1234;

public class BT4 {
	public static void main(String[] args) {
		int a = 45;
		int b = 20;
		System.out.println(""+getLeastCommonMultiple(a, b));
	}
	
	public static int getLeastCommonMultiple(int a, int b) {
		//Tim UCLN
		int a1 = a;
		int b1 = b;
		int ucln = 0;
		while (a!=b) {
			if (a>b) {
				if (a % b == 0) {
					ucln = b;
					break;
				}
				a = a % b;
			}
			else {
				if (b % a == 0) {
					ucln = a;
					break;
				}
				b = b % a;
			}
		}
		return a1*b1/ucln;
	}
}

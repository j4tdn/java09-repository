package Test03;

public class Test03 {
	public static void main(String[] args) {
		if(isPowerOf(65,4)) System.out.println("Phải");
		else System.out.println("không phải");
	}
	public static boolean isPowerOf(int a,int b) {
		int x=b*b;
		while(a>x) {
			if(a%b!=0) {
				return false;
			}
			else {
				a=a/b;
				if(a==x) return true;
				else continue;
			}
		}
		return false;
	}
}

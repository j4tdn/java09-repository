package java09.lesson05_nguyenhongchanh;

public class Ex04 {
	public static int uscln(int a, int b) {
		int result =1; 
		int sb =a;
		int sl =b;
		if (a>b) {
			sb=b;
			sl=a;}
		for (int i = sb; sb > 0; i--) {
			if (sb % i == 0 ) {
				if (sl % i == 0) {result =i;} 
			}
		}
		System.out.println(result);
		return result;
	}
	
	public static int getLeastCommonMultiple(int a, int b ) {
		return (a*b)/uscln(a,b);
	}
	
	public static void main(String[] args) {
		uscln(6,12);
	}
}
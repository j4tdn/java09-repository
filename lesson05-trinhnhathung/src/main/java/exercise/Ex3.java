package exercise;

public class Ex3 {
	public static void main(String[] args) {
        System.out.println(isPowerOf(4, 64));
	}
	
	public static boolean isPowerOf (int a,int b) {
		 int x = (a > b ) ? a :b;
		 int y = (a + b ) -x;
		 if (y ==1) {
			 return true;
		 }
		 while (x % y == 0 && x > 0 ) {
			 x = x/y;
		 }
		 if (x ==1) {
			 return true;
		 } else {
			 return false;
		 }
	}
}

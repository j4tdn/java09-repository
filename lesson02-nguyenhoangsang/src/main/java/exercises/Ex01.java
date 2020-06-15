package exercises;

public class Ex01 {
	public static void main(String[] args) {
		arrange(9,1,4);
	}
	public static void arrange(int a,int b,int c) {
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("Gia tri tang dan la : " + a + " " + b + " "  + c);
	}
}

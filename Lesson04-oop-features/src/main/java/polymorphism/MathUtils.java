package polymorphism;

public class MathUtils {
	private MathUtils() {
		
	}
	//oveload
	
	public static int sum(int a, int b ,int c) {
		return a+b+c;
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}

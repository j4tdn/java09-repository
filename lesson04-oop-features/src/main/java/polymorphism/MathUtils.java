package polymorphism;

public class MathUtils {
	private MathUtils() {
		
	}
	//overloading 
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a,int b, int c) {
		return a+b+c;
	}
	public static int sum(float a, float b, float c) {
		return 0;
	}
	
}

package polymorphism;

public class MathUtils {
	private MathUtils() {
		
	}
	//overloading
	public static float sum(float a,float b,float c) {
		return 0;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static int sum(int a,int b) {
		return a+b;
	
	}
}

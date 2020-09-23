package polymorphism.method;

public class MathUtils {
	
	private MathUtils() {
		
	}
	
	// tinh chat da hinh (overload)
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b,int c) { //da hinh (overload)
		return a + b + c;
	}
	
	public static int sum(float a, int b,int c) { //da hinh (overload)
		return 0;
	}
}

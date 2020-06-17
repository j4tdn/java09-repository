package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = 20;
		
		System.out.println("a code: " + System.identityHashCode(a));
		System.out.println("b code: " + System.identityHashCode(b));
		// modified(a);
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void modified(Integer a) {
		System.out.println("a method code 01: " + System.identityHashCode(a));
		a = 20;
		System.out.println("a method code 02: " + System.identityHashCode(a));
	}
	
	// a->01 b->02
	// 
	private static void swap(Integer a, Integer b) {
		a = a + b; // a->03
		b = a - b; // b->01
		a = a - b; // a->02
	}
	
	private static void modified(int a, int b) {
		b = 30;
		a = b;
		a = 40;
	}
}

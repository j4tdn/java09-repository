package datatype;

public class Ex04PrimitiveTypeExe {
	public static void main(String[] args ) {
		Integer a=10;
		Integer b=20;
		
		//a=b;
		//b=a;
		
		System.out.println("a code: " + System.identityHashCode(a));
		System.out.println("b code: " + System.identityHashCode(b));
	   swap(a, b);
		//modified(a, b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
	}
	private static void modified(Integer a, Integer b) {
		System.out.println("method code01: " + System.identityHashCode(a));
		System.out.println("method code02: " + System.identityHashCode(b));

		a=20;
		
	
	}
	//a->01 b->02
	private static void swap(Integer a, Integer b) {
		a=a+b; // a->03
		b=a-b; // b->01
		a=a-b; // a->02
	
	}
}

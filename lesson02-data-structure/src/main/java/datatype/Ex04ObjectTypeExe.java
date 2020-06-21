package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		
		System.out.println("a code: " + System.identityHashCode(a));
		System.out.println("b code: " + System.identityHashCode(b));
		
		change(a);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	static void change(Integer a) {
		a = 30;
		System.out.println("a code: " + System.identityHashCode(a));
	}
	
	static void swap(Integer a, Integer b) {
		Integer c = a;
		a = b;
		b = c;
	}
}

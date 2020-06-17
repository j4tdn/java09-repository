package datatype;

public class Ex05Swap {
	public static void main(String[] args) {
		Int a = new Int(5);
		Int b = new Int(10);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		swap(a, b);
		System.out.println("==========");
		System.out.println("a: " + a); // a=10
		System.out.println("b: " + b); // b=5
		
		modified(a);
		System.out.println("==========");
		System.out.println("a: " + a); // a=? 77 10 77 10 10
		
	}
	
	private static void modified(Int a) {
		a.value = 22;
		a = new Int(99);
		a.value = 77;
	}
	
	private static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}

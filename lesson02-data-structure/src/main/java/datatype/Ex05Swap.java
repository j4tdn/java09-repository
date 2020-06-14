package datatype;

public class Ex05Swap {
	public static void main(String[] args) {
		Int a = new Int(5);
		Int b = new Int(10);
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);
		
		swap(a, b);
		
		System.out.println("a value: " + a);
		System.out.println("b value: " + b);
		
		modified(a);
		System.out.println("a value: " + a);
	}
	
	static void modified(Int a) {
		a.value = 99;
	}
	
	static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}
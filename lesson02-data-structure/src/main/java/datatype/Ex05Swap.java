package datatype;

public class Ex05Swap {
	public static void main(String[] args) {
		Int a= new Int(5);
		Int b= new Int(10);
		
		swap(a,b);
		
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		
		modified(a);
		
		System.out.println("a: " +a);
		
	}
	
	private static void swap(Int a,Int b) {
		int tmp =a.value;
		a.value=b.value;
		b.value=tmp;
	}
	
	private static void modified(Int a) {
		a.value = 22;
		a = new Int(99);
		a.value = 77;
	}
}

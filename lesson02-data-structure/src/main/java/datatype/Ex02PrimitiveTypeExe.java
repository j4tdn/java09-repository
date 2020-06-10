package datatype;

public class Ex02PrimitiveTypeExe {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
	
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		swap(a,b);
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
	}
	private static void swap(int a, int b) {
		a = a +b;
		b = a-b;
		a = a-b;
	}
	
	
}

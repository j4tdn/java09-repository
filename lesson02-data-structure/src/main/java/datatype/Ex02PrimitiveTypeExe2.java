package datatype;

public class Ex02PrimitiveTypeExe2 {
	public static void main(String[] args ) {
		Integer a=10;
		Integer b=20;
		//a=b;
		//b=a;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		swap(a,b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
	}
	private static void swap(Integer a, Integer b) {
		a = a + b;
		b = a - b;
		a = a - b;
	
	}

}

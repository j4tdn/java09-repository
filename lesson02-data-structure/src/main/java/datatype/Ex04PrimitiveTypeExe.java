package datatype;

public class Ex04PrimitiveTypeExe {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
			System.out.println("a code "+System.identityHashCode(a)); 
			System.out.println("b code "+System.identityHashCode(b));
			modified(a);
			//swap(a, b);
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			
	}
	private static void modified(Integer a, Integer b) {
		a=a+b;
		b=a-b;
		a=a-b;

	}
}

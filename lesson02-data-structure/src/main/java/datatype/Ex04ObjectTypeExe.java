package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		//apply with available object type of standard Java 
		Integer a=10;
		Integer b=20;
	
		System.out.println("a: code" + System.identityHashCode(a));
		System.out.println("b: code"+ System.identityHashCode(b));
	
		//swap(a,b);
		modified(a,b);
		System.out.println("a: " + a);
		System.out.println("b: "+ b);
	}
	
	private static void swap(Integer a, Integer b) {
		a=a+b;
		b=a-b;
		a=a-b;
	}
	private static void modified(int a , int b) {
		System.out.println("a method code 01"+System.identityHashCode(a));
		a=20;
		System.out.println("a method code 02"+System.identityHashCode(a));
	}
}

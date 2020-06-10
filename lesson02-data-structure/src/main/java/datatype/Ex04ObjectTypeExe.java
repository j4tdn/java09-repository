package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
		System.out.println("code: " + System.identityHashCode(a) + "," +System.identityHashCode(b) );
		modified(a);
		//swap(a,b);
		System.out.println("code: " + System.identityHashCode(a) + "," +System.identityHashCode(b) );
		System.out.println(a + "," + b);
	}
	
	private static void swap(Integer a,Integer b) {
		a=a+b;
		b=a-b;
		a=a-b;
	}
	private static void modified(Integer a) {
		System.out.println("code : " + System.identityHashCode(a) );
		a=20;
		System.out.println("code : " + System.identityHashCode(a) );
	} 

}

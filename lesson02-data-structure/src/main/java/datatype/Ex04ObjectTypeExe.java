package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer c = 10;

		
		modified(a);//tham tri , co nghia la chi truyen gia tri
		//swap(a,b);
		
		System.out.println("a code : " + System.identityHashCode(a));
		System.out.println("b code : " + System.identityHashCode(b));
		System.out.println("c code : " + System.identityHashCode(c));
	}
	//a --> 01 , b -->02
	private static void swap(int a,int b) {
		a = a + b;//a --> 03
		b = a - b;//b --> 01
		a = a - b;//a --> 02
	}
	
	
	private static void modified(Integer a) {
		System.out.println("a method code 01 : " + System.identityHashCode(a));
		a = 20;
		System.out.println("a method code 02 : " + System.identityHashCode(a));//dia chi trung voi noi luu gia tri 20 tai constant pool(nghia la dia chi cua b)
	}
}

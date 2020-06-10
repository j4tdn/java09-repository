package datatype;

public class Ex04ObjectTypeExe {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		System.out.println("a code:" + System.identityHashCode(a));
		System.out.println("b code:" + System.identityHashCode(b));
		modified(a);
//		swap(a, b);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
    private static void swap (Integer a,Integer b) {
    	int tmp=a;
    	a=b;
    	b=tmp;
    }
	private static void modified(Integer a) {
		System.out.println("a method code 1:" + System.identityHashCode(a));
		a=30;
		System.out.println("a method code 2:" + System.identityHashCode(a));
	}
}

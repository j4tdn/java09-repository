package datatype;

public class Ex02PrimitiveTypeExe {
	public static void main(String[] args) {
		int a; 
		int b=20;
		a=b;
		b=a;
		System.out.println(a+","+b);
		swap(a, b);
		System.out.println(a+","+b);
	}
private static void swap (int a, int b) {
	int temp=a;
	a=b;
	b=temp;
}
}



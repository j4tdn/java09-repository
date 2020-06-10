package datatype;

public class Ex02PrimitiveTypeExe {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a + ", b:" + b);
		swap(a, b);
		System.out.println("a:"+a + ", b:" + b);
	}
private static void swap(int a,int b) {
	int temp=a;
	a=b;
	b=temp;
}

}

package beans;

public class StaticTest {
	private static String text;
	private int number;
	public static void main(String[] args) {
		StaticTest test01=new StaticTest();
		test01.text="hello";
		test01.number=0;
		System.out.println(test01.text);
		
		StaticTest test02=new StaticTest();
		test02.text="bye";
		test02.number=1;
		System.out.println(test01.text);
		int a=3;
		int b=4;
		StaticTest t1=new StaticTest();
		t1.sum(a, b);
		System.out.println(t1.sum(a, b));
	}
	private int sum(int a, int b) {
		return this.number+a+b;
	}
	private static int staticsum(int a, int b) {
		return a+b;
	}
}

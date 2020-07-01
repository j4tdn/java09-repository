package beans;

public class StaticTest {
	private static String text;
	private int number;
	
	public static void main(String[] args) {
		StaticTest test01 = new StaticTest();
		test01.text = "hello";
		test01.number = 0;
		System.out.println("test01 : " + test01.text);
		
		StaticTest test02 = new StaticTest();
		test02.text = "goodbye";
		test02.number = 1;
		
		System.out.println("test01 : " + test01.text);
		
		int a = 10;
		int b = 5;
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		StaticTest st4 = new StaticTest();
		StaticTest st5 = new StaticTest();
		StaticTest st6 = new StaticTest();
		
		st1.sum(a,b);
		st2.sum(a,b);
		st3.sum(a,b);
		st4.sum(a,b);
		st5.sum(a,b);
		st6.sum(a,b);
			
	}
	
	private static int staticSum(int a,int b) {
		return a + b;
	}
	
	private int sum(int a,int b) {
		return this.number + a + b;
	}
}

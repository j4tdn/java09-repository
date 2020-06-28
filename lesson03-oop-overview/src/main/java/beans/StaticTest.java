package beans;

public class StaticTest {
	private static String text;
	private int number;
	static int a = 1 ;
	static int b = 1;
	
	public static void main(String[] args) {
		StaticTest test01 = new StaticTest();
		test01.text = "Hello";
		test01.number = 0;
		
		System.out.println("TEST01 : " + test01.text);
		StaticTest test02 = new StaticTest();
		test02.text = "ByeBye";
		test02.number = 1;
		System.out.println("TEST01 : " + test01.text);
		StaticTest ss1 = new StaticTest();
		ss1.staticSum(a,b);
		
		
	}
	//static
	private  static int staticSum (int a , int b) {
		return  a + b;
	}
	//non - static
		private int Sum  (int a , int b) {
			return this.number + a + b;
	}
}

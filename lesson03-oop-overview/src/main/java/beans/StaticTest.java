package beans;

public class StaticTest {
	private static String text;
	private int number;
	
	public static void main(String[] args) {
		StaticTest test01 = new StaticTest();
		StaticTest test02 = new StaticTest();
		
		test01.text = "hello";
		test01.number = 0;
		
		test02.text = "google";
		test02.number = 1;
		
		System.out.println(test01.text);
	}
	
	private static int staticSum(int a, int b) {
		return a + b;
	}
	
	private int Sum(int a, int b) {
		return a + b + this.number;
	}
}

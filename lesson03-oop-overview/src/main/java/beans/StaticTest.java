package beans;

public class StaticTest {
	private static String text;
	private int number;

	public static void main(String[] args) {
		StaticTest text01 = new StaticTest();
		text01.text = "hello";
		text01.number = 0;
		System.out.println("text01:" + text01.text);
		StaticTest text02 = new StaticTest();
		text02.text = "goodbye";
		text02.number = 1;
		System.out.println("text01:" + text01.text);

	}
	// static
	
	private static int staticSum(int a, int b) {
		return a + b;

	}

	private int sum(int a, int b) {
		return this.number + a + b;
	}
}

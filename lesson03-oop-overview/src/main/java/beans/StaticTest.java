package beans;

public class StaticTest {
	private static String text;
	private int number;
	public static void main(String[] args) {
		StaticTest test01=new StaticTest();
		test01.text="hello";
		test01.number=0;
		
		System.out.println("test01 " + test01.text);
		
		
		StaticTest test02=new StaticTest();
		test02.text="byebye";
		test02.number=1;
		System.out.println("test01 " + test01.text);}
		
		
//static
		private static int staticSum(int a, int b) {
			return a+b;
		}
	
//non static
	
	private int sum(int a, int b) {
		return this.number +a + b;
	}
}

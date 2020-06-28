package beans;

public class StaticTest {
    private static String text;
    private int number;
    public static void main(String[] args) {
		StaticTest test01=new StaticTest();
		test01.text="Hello";
		test01.number=0;
		
		System.out.println("Test01: "+test01.text);
		StaticTest test02=new StaticTest();
		test02.text="goodbye";
		test02.number=1;
		System.out.println("Test01: "+test01.text);
		
		StaticTest st1=new StaticTest();
	}
    //non static
    private int sum(int a,int b) {
    	return a+b;
    }
    //static, dont care about current object
    private int staticSum(int a,int b) {
    	return this.number+a+b;
    }
}

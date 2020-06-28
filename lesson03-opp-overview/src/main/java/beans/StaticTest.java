package beans;

public class StaticTest {
private static String text;
private int number;
public static void main(String[] args) {
	StaticTest test01 =new StaticTest();
	test01.text="hello";
	test01.number=0;
	System.out.println("test01: "+test01.text);
	StaticTest test02= new StaticTest();
	test02.text="goodbye";
	test02.number=1;
	System.out.println("test01: "+test01.text);
	
	
}
//statitc, không quan tâm đến đối tượng thì dùng static
private static int staticSum ( int a , int b)
{
	return a+b;
}
//nonstatic, quan tâm đến đối tượng thì dùng non-static
	private int sum (int a, int b)
	{
		return this.number+a+b;
	}

}

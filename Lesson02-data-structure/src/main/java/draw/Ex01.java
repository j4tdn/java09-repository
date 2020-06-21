package draw;

public class Ex01 {
public static void main(String[] args) {
	drawex01 (5);
	drawex02 (5);
	drawex03 (5);
	drawex04 (5);
}
private static void drawex01 (int n)
{
	for ( int i=1;i<=n;i++)
	{
		System.out.print("*");
	}
}
private static void drawex02 (int n)
{
	for (int i=1;i<=n;i++)
	{
		System.out.println("*");
	}
}
private static void drawex03 (int n)
{
	for (int i=1;i<=n;i++)
	{
		for(int  j=1;j<i;j++) {
			System.out.print(" ");}
		System.out.println("*");
	}
}
private static void drawex04 (int n)
{
	for (int i=1;i<=n;i++)
	{
		for(int  j=n-i;j>=1;j--) {
			System.out.print(" ");}
		System.out.println("*");
	}
}

}

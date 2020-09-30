package lesson05;

public class Ex03 {
public static void main(String[] args) {
	int a=8;
	int b=2;
	
	System.out.println(isPowerOf(a, b));
	
}
public static boolean isPowerOf (int a,int b)
{
	if (a<=0||b<=0) return false;
	if (a==b) return true;
	if (PowerOf(a, b)==a||PowerOf(a, b)==b) return true;
	return false;
}
public static int PowerOf( int a, int b)
{  int result=1;
if (a>b)
{
	for( int i=0;i<=b;i++)
	{ 
		 result*=b;
		 
		 
	}
}
else if (a<b) {
	for( int i=0;i<=a;i++)
	{
		 result*=a;
	}
}

return result;

}

}

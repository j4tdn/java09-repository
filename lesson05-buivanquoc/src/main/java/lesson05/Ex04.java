package lesson05;

public class Ex04 {
public static void main(String[] args) {
	int a[]= {2,3,4};
	System.out.println(BCNNOfMang(a));
}
	public static int UCLN(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) 
			return UCLN(a - b, b);
		 else 
			 return UCLN(a, b - a);
		
		}

	

	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}
public static int BCNNOfMang( int a[])
	{ int result = 1;
		int tmp=BCNN(a[0],a[1]);
		for ( int i=2;i<a.length;i++)
		{
			result=BCNN(tmp,a[i]);
		}
		return result;
	}
}

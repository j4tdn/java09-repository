package Test04;

public class Test04 {
	public static void main(String[] args) {
		int a[]= {2,7,12};
		System.out.println(getLeastComonMutiple(a));
	}
	public static int UCLN(int a,int b) {
		if(a==b) return a;
		if(a>b) {
			 return UCLN(a-b,b);
		}
		else  return UCLN(a,b-a);
	}
	public static int  BCNN(int a,int b) {
		return (a*b/UCLN(a,b));
	}
	public static int getLeastComonMutiple(int a[]) {
	   int min=BCNN(a[0],a[1]);
	   for(int i=2;i<a.length;i++) {
		   min =BCNN(min,a[i]);
	   }
		return min;
	}
}

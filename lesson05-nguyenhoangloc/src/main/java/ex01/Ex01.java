package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int[] A= {3, 15, 21, 0, 15, 17, 21};
	
	}
	public static int[] Find(int[] a) {
		int[] B= {};
		int dem=0;
		int b=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=1;j<i;j++) {
			if(j==a[i]) 
				dem++;
			
			}
			if(dem==0) {
				b=a[i];
			}
			B= {b};
		}
		return B;

	}
//	public int[] getUniqueNumbers(int[] a) {
//		for(int i=0;i<=a.length;i++) {
//			if(Find(a[i], 2)==0)
//		}
//	}
}

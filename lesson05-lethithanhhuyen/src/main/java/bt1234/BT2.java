package bt1234;

public class BT2 {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7,8,9};
		System.out.println(""+getMissingNumber(a));
	}
	
	public static int getMissingNumber(int[] a) {
		int n = a.length + 1;
		int sum = (int) n*(n+1)/2;
		for (int i = 0; i<a.length; i++) {
			sum-=a[i];
		}
		return sum;
	}
}

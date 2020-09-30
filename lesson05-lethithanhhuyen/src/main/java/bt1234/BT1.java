package bt1234;

public class BT1 {
	public static void main(String[] args) {
		int a[] = {2,3,15,3,5,6,17,4,5,4,16,7,8};
		int b[] = getUniqueNumbers(a);
		for (int i = 0; i<b.length; i++) {
			if (i>0 && b[i] == 0) {
				break;
			}
			System.out.printf(b[i]+"\t");
		}
	}
	
	public static int[] getUniqueNumbers(int[] a) {
		for (int i = 0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		int[] b = new int [20];
		int dem=0;
		for (int i = 0 ; i<a.length; i++) {
			if ((i == 0 && a[i]!=a[i+1]) || 
				(i == a.length - 1 && a[i] != a[i-1]) ||
				(i>0 && a[i]!=a[i+1] && a[i]!=a[i-1])){
				b[dem] = a[i];
				++dem;
			}
		}
		return b;
	}

}

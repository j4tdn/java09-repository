package exercise01;

public class Ex05 {
	public static void main(String[] args) {
		int n=18;
		int[] num= new int[dem(n)];
		
		sonhiphan(num,n);
		
	}
	
	private static int dem (int n) {
		int r=0;
		
		while (n>0) {
			r++;
			n=n/2;
		}
		
		return r;
	}
	
	private static void sonhiphan(int[] num,int n) {
		
		int r = dem(n);
		while (n>0) {
			num[r-1]=n%2;
			n=n/2;
			r--;
		}
		
		for (int i=0; i< num.length ; i++) {
			System.out.print(num[i]);
		}
	}

}

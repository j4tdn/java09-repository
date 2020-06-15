package exercise01;

public class Ex03 {
	public static void main(String[] args) {
		int i = 13531;
		
		int[] num= new int[so(i)];
		
		tach(i,num);
		
		kiemtra(i,num);
		
		
	}
	
	private static int so(int a) {
		int d=0;
		while (a>0) {
			a=a/10;
			d++;
		}
		return d;
	}
	
	private static void tach(int a, int[] num) {
		for (int n= 0; n< num.length; n++) {
			num[n]= a%10;
			a = a/10;
		}
	}
	
	private static void kiemtra(int i,int[] num) {
		boolean r = true;
		for (int n= 0; n< so(i)/2; n++) {
			if (num[n] != num[num.length -1 - n]) {
				r = false;
			}
		}
		
		if (r) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

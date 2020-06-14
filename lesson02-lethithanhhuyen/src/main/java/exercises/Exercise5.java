package exercises;

public class Exercise5 {
	public static void main(String[] args) {
		int[] a= new int[50];
		int n=6, i=0;
		while (n>0) {
			a[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j=i-1; j>=0; j--)
			System.out.print(a[j]);
	}

}

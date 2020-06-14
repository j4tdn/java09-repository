package exercises;

import java.util.Scanner;
import java.util.ArrayList;
public class Exercise06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Nhap so muon doi o he 10: ");
		n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0;
		int k;
		while(n>0) {
			k=n%2;
			list.add(k);
			i++;
			n=n/2;			
		}
		for(int j=list.size()-1;j>=0;j--) {
			System.out.print(list.get(j));
		}
	}
}

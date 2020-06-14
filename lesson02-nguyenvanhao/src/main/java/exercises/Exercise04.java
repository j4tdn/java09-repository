package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong: ");
		int n=sc.nextInt();
		int k=0;
		int m=0;
		int[] array =new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			//System.out.print("  ");
		}
		for(int i=0;i<n;i++) {
			if(array[i]%2!=0) {
				k++;
			}
		}
		int[] array1=new int[k];
		for(int i=0;i<n;i++) {
			if(array[i]%2!=0) {
				array1[m]=array[i];
				m++;
			}
		}
		Arrays.sort(array1);
		System.out.print("So le lon thu 2 la:");
		System.out.println(array1[k-2]);
	}
}

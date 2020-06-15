package nguyenthithuthao.lesson02_nguyenthithuthao;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Exercise04 {

	

	public static void main(String[] args) {
		int i,n,a;

		Scanner scan =new Scanner(System.in);
		do {
			System.out.println("Number of elements in array: ");
			n=scan.nextInt();
		}while (n<=0);
		int A []=new int[n];
		int Od [] =new int[n];
		System.out.println(" Enter the number in array:");
		for(i=0;i<n;i++) {
			System.out.println(" The number :" + (i+1) );
			A[i]= scan.nextInt();	
		}
		int max=A[0];
		for(i=0;i<n;i++) {
			if(A[i]%2!=0 && A[i]>A[0] ) {
				max = A[i];	
			}
			
		}
		int max2 = A[0];
		for(i=0;i<n;i++) {
			if(A[i]%2!=0 && A[i]>A[0] && A[i] != max) {
				max2 = A[i];
			}
		}
		System.out.println("2nd largest number is:" + max2);
		
		
		
		
		
	}
	}

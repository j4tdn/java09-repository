package exercise;

import java.util.Scanner;

public class Exercise4 {
	
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int[] array=new int[20];
			System.out.print("nhap n: ");	
			int n =scanner.nextInt();
			for (int i=0 ; i < n ; i++) {
				System.out.print("nhap phan tu"+i +":" );
				 array[i]  =scanner.nextInt();
			}
			sapXep(array,n);               
			int dem=0;
			int i=0;
			while(dem < 2) {
					 if (array[i] % 2 != 0){
						 dem++;
						 i++;
				}else{
					i++;
				}
			}
		System.out.println(array[i-1]);	 
			 }
		public static void sapXep (int [] a, int n) {
			int temp; 
			for (int i = 0 ; i < n-1; i++) {
				 for (int j = 0; j <= n-i-1 ; j++) {
					 if (a[j] < a[j+1]  ) {
						 temp = a[j];
						 a[j] = a[j+1];
						 a[j+1] = temp;
					 }
				 }
		}
			
}
}
		
		
		
		


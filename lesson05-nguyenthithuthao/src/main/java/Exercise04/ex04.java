package Exercise04;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ex04 {
	public static void main(String[] args) {
		int n = 7;
		int[] A = { 3, 5, 7, 0, 4, 1, 2};
		System.out.println("bội chung nhỏ nhất là");
	}	
	public static int solonnhat(int A [],int n) {
		int max = A[0];
		for(int i=1;i<=n;i++) {
			if((max==0)||A[i]==0) {
				break;
			}
			max =( max> A[i]) ? max : A[i];
			
		}
		return max;
	}
	public static int boichungnhonhat(int A [],int n) { 
		int boichung = solonnhat(A, n);
		for(int i = 0;i<n;i++) {
			if(!(boichung % A[i] ==0) ) {
				boichung = boichung ;
				i=-i;
				
				
			}
		}
		
		return boichung;
		
	}

}

package nguyenthithuthao.lesson02_nguyenthithuthao;

import nguyenthithuthao.lesson02_nguyenthithuthao.Exercise02;

public class Exercise02 {
public static void main (String[] args) {
	int a=4;
	int b=7;
	int c=12;
	int d =18;
	
	long S= Exercise02.factorial(a) + Exercise02.factorial(b)+ Exercise02.factorial(c)+ Exercise02.factorial(d);
	System.out.println(" Tổng S=: " + S);
	
}
public static long factorial(int n) {
	long fac =1;
	if(n==0 || n==1) {
		return fac =1;
		
	}else {
		for (int i =2; i< n; i++) {
			fac*=i;
			
		}
		}
	return fac;
	}
	
}



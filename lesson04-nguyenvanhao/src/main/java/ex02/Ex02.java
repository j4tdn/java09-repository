package ex02;

import java.util.Scanner;

public class Ex02 {
	 public static Scanner sc=new Scanner(System.in);
		private static void swap(Number a, Number b) {     
	        int temp = a.getNum();                 
	        a.setNum(b.getNum());                  
	        b.setNum(temp);                   
	    }
	public static void chuyen(Number A[]) {
		int k=0;
		for(int i=0;i<A.length;i++) {
			if(i==0&&(A[i].getNum()%7==0)&&(A[i].getNum()%5!=0)) {
				k++;
			}
			else if((A[i].getNum()%7==0)&&(A[i].getNum()%5!=0)) {				
			   swap(A[i],A[k]);
			   k++;
			}
		}
		int h=A.length-1;
		for(int i=A.length-1;i>=0;i--) {
			if(i==(A.length-1)&&(A[i].getNum()%5==0)&&(A[i].getNum()%7!=0)) {
				h--;
			}
			else if((A[i].getNum()%5==0)&&(A[i].getNum()%7!=0)) {				
			   swap(A[i],A[h]);
			   h--;
			}
		}
		int count=0;
		for(int i=0;i<A.length;i++) {
			if((A[i].getNum()%5==0)&&(A[i].getNum()%7==0)) {
				count++;
			}
		}
		int d=count/2;
		int g=((h+k)/2)-d;
		int o=g;
		while(A[g].getNum()%5==0&&A[g].getNum()%7==0) {
			g++;
		}
		for(int i=k;i<=h;i++) {
			if(i>=(o-d)&&i<=(o+d)) {
				continue;
			}
			else if(A[i].getNum()%7==0&&A[i].getNum()%5==0) {
				swap(A[i],A[g]);
				g++;
			}
		}
		
	}
	public static void main(String[] args) {
		int m;
		System.out.print("Nhập số lượng phần tử: ");
		m=sc.nextInt();
		Number[] n=new Number[m];
		System.out.println("Nhập dãy");
		for(int i=0;i<m;i++) {
			n[i]=new Number(sc.nextInt());
		}
		chuyen(n);
		for (Number number : n) {
			System.out.print(number.getNum()+"  ");
		}
	}
 
}

package exercises;

import java.util.Scanner;

public class Exercises03 {
	static boolean isSoDoiXung(int n) {
		int m=n;
		int k=0,j;
		while(m>0) {
			j=m%10;
			k=k*10+j;
			m=m/10;
		}
		if(k==n) return true;
		else return false;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    	System.out.print("Nhap so can kiem tra:");
    	int a=sc.nextInt();
    	if(isSoDoiXung(a)==true) {
    		System.out.println("La so doi xung!!!");
    	}
    	else {
    		System.out.println("Khong phai so doi xung!!!");
    	}
    	}
    }
}

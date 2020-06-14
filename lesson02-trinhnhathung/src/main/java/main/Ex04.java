package main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		 int []a= {5,1,9,11,20,19,17,21,30};
		 Arrays.sort(a);
		 int count=0;
		 for (int i=a.length-1;i>=0;i--) {
			 if (a[i]%2==1) {
				 count++;
				 if (count==2) {
					 System.out.println(a[i]);
				 }
			 }
		 }
	}
}

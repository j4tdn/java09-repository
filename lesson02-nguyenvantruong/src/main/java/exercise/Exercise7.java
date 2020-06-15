package exercise;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
	    int lenght=0;
	    Random rd = new Random();
	    int[] number= new int[5];      
	    while(lenght<5) {
	    	int num=20+rd.nextInt(11);
	    	if(isDuplicate(number, num, lenght)) {
	    		System.out.print(num+"  ");
	    		number[lenght]=num;
	    		lenght++;
	    	}
	    }
	 
	   // for(int num: number) {
	    //	System.out.println(num+" ");
	    //}
	         
	   
	}
	public static boolean isDuplicate (int[] a, int num, int lenght){
		
		for(int i=0 ; i <= lenght; i++) {
			if(num==a[i]) {
				return false;
			}
		}
		return true;
	}
}

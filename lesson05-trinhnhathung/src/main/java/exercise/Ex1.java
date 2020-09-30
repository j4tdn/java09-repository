package exercise;

import java.util.Arrays;

public class Ex1 {
     public static void main(String[] args) {
		int arr[] = {3,15,21,0,15,17,21};
		int a[] = getUniqueNumbers(arr);
		for (int x : a ) {
			System.out.println(x + " ");
		}
     }
     
    public static int [] getUniqueNumbers (int[] arr) {
    	 Arrays.sort(arr);
    	 int [] a = new int[arr.length];
    	 int count = 1;
    	 int j =0;
    	 for (int i = 1; i < arr.length; i++) {
    		 if (arr[i] != arr[i-1]) {
    			 if (count == 1) {
    				 a[j] = arr[i-1];
    				 j++;
    			 } else {
    				 count = 1;
    			 }
    		 } else {
    			    count++;
    		 }
    	 }
    	 int result [] = new int [j];
    	 for (int i =0 ; i < result.length;i++) {
    		 result[i] = a[i];
    	 }
    	 return result;
    }
}

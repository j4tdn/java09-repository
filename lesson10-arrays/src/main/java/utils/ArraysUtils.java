package utils;

import java.util.Arrays;


public class ArraysUtils {
	public ArraysUtils() {
	}
	
	public static void print(int[] array) {
		for(int arrays:array) {
			System.out.print(arrays+" ");
		}
		System.out.println();
	}
	public static void print(String[] sequences) {
		for(String sequence:sequences) {
			System.out.print(sequence+" ");
		}
		System.out.println();
	}
	
	
	public static void soft(int[] number, SortOrder order) {
		Arrays.sort(number);
		if(order== SortOrder.DESC) {
			reverse(number);
		}
	}
	
	public static void bubbleSort(int[] number) {
		for (int out = number.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (number[in] > number[out]) {
					int tmp = number[in];
					number[in] = number[out];
					number[out] = tmp;
				}
			}
		}
	}
	public static void bubbleSort(String[] sequences) {
//		for(int out=sequences.length-1;out>0;out--) {
//			if(sequences[out]==null) {
//				continue;
//			}
//			for(int in=0;in<out;in++) {
//				if(sequences[in]==null) {
//					String tmp = sequences[in];
//					sequences[in] = sequences[out];
//					sequences[out] = tmp;
//					break;
//				}
//				if(sequences[in].compareTo(sequences[out])>0) {
//					String tmp = sequences[in];
//					sequences[in] = sequences[out];
//					sequences[out] = tmp;
//				}
//				
//			}
//			
//		}
		for (int out = sequences.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(sequences[in]==null) {
					continue;
				}
				if (sequences[out]==null || sequences[in].compareTo(sequences[out]) >0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
	private static void reverse(int[] number) {
		for(int i=0;i<number.length/2;i++) {
			int tmp=number[i];
			number[i]=number[number.length-i-1];
			number[number.length-i-1]=tmp;
		}
	}
	public enum SortOrder{
		ASC, DESC
	}
}

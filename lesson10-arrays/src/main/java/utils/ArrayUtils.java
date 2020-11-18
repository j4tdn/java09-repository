package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {
	public ArrayUtils() {
		
	}
	public static void printf(int[] numbers) {
		for(int number:numbers) {
			System.out.print(number+"  ");
		}
		System.out.println();
	}
	public static void printf(String[] sequences) {
		for(String sequence:sequences) {
			System.out.print(sequence+"  ");
		}
		System.out.println();
	}
	public static void sort(int[] numbers,SortOrder order) {
		Arrays.sort(numbers);
		if(order==SortOrder.DESC) {
			reverse(numbers);
		}
	}
	public static void bubbleSort(int[] numbers) {
		for(int out=numbers.length-1;out>0;out--) {
			for(int in=0;in<out;in++) {
				if(numbers[in]<numbers[out]) {
					int tmp=numbers[in];
					numbers[in]=numbers[out];
					numbers[out]=tmp;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] sequences) {
		for(int out=sequences.length-1;out>0;out--) {
			for(int in=0;in<out;in++) {
				if(sequences[in]==null) {
					continue;
				}
				if(sequences[out]==null||sequences[in].compareToIgnoreCase(sequences[out])>0) {
					String tmp=sequences[in];
					sequences[in]=sequences[out];
					sequences[out]=tmp;
				}
			}
		}
	}
	public static void printf(Item[] items) {
		for(Item item:items) {
			System.out.println(item);
		}
	}
	public static void reverse(int[] numbers) {
		for(int i=0;i<numbers.length/2;i++) {
			int tmp=numbers[i];
			numbers[i]=numbers[numbers.length-i-1];
			numbers[numbers.length-i-1]=tmp;
		}
	}public static void reverse(String[] sequences) {
		for(int i=0;i<sequences.length/2;i++) {
			String tmp=sequences[i];
			sequences[i]=sequences[sequences.length-i-1];
			sequences[sequences.length-i-1]=tmp;
		}
	}
	public enum SortOrder{
		ASC,DESC
	}
}

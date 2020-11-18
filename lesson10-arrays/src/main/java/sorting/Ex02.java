package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"a","1",null,"c","5","5"};
		ArrayUtils.bubbleSort(sequences);
		ArrayUtils.printf(sequences);
		
		
    }
}

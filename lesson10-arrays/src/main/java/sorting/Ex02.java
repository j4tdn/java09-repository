package sorting;

import java.util.Arrays;

import static utils.ArraysUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences= {"a","1","7",null,"c","5",null,"k","b"};
		bubbleSort(sequences);
		printf(sequences);
	}
}

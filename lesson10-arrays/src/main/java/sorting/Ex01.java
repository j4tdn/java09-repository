package sorting;

import java.util.Arrays;

import utils.ArrayUtils;
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1,5,9,4,6,11};
		ArrayUtils.printf(numbers);
		
		// sort dung ham co san
		Arrays.sort(numbers);
		ArrayUtils.printf(numbers);
	}
	

}

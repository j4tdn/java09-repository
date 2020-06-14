package main;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		int count = 0, index = 0;
		int []arr = {5, 1, 9, 11, 20, 19, 17, 21, 30};
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >= 0; i--) {
			if((arr[i] % 2) != 0) {
				index = i;
				count ++;
				if(count == 2)
					break;
			}
		}
		if(count == 2)
			System.out.println(arr[index]);
		else System.out.println("Không có số lẻ lớn thứ 2 ! ");
		
	}

}

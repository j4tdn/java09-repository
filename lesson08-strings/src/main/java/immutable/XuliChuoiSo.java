package immutable;

import java.awt.print.Book;

public class XuliChuoiSo {
	public static void main(String[] args) {
		String s = "1,2,3,2";
		System.out.println(getUniqueNumber(s));
	}
	public static String getUniqueNumber(String s) {
		String[] arr = s.split(",");
		String result = "";
		for (String s0 : arr) {
			int check = 0;
			for(String s1:arr) {
				if (s0.equals(s1)) {
					check ++;
					if(check == 2) {
						break;
					}
				}
				
			}
			if (check == 1) {
				result = result + s0 + " ";
				
			}
		}
//		return result;
		
		
		//C2
		String[] numbers = s.split(",");
		StringBuilder result1 = new StringBuilder("");
		//default : false
		boolean[] flags = new boolean[numbers.length];
		for(int out = 0 ; out < numbers.length ; out++) {
			if (!flags[out]) {
				for(int in = out + 1 ; in < numbers.length ; in++) {
					if(numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(flags[i]==false) {
				result1.append(numbers[i]);
			}
		}
		return result1.toString();
	}
}

package bai3;

public class Bai3 {
	public static void main(String[] args) {
		
		String s = "aqa123j7uu89zz";
		for(int i = 0; i > s.length(); i++) {
			StringBuilder nbrAsString = new StringBuilder();
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				nbrAsString.append(c);
			}
		}
		
		String str = "xyz";
		String[] arr = str.split("");
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.print(arr[i]);
		}
		for(int i = arr.length - 1 ; i > 0 ; i--) {
			if (arr[i] > arr[i - 1]) {
				
			}
		}
	}
}

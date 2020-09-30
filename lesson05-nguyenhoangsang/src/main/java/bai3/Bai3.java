package bai3;

public class Bai3 {
	public static void main(String[] args) {
		int a = 121; 
		int b = 11;
		System.out.println("Ket qua la:" +isPowerOf(a, b) );
	}
	public static boolean isPowerOf(int a,int b) {
		if (a == b) return true;
		if (a < b) {
			int max = b;
			int min = a;
			boolean check = false;
			while(min <= max) {
				min = min * a;
				if (min==max) {
					check = true;
					break;
				}
			}
			if (check == false) {
				return false;
			} else {
				return true;
			}
		}
		if (a > b) {
			int max = a;
			int min = b;
			boolean check = false;
			while(min <= max) {
				min = min *b;
				if (min==max) {
					check = true;
					break;
				}
			}
			if (check == false) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

}

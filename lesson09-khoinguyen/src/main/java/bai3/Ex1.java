package bai3;

public class Ex1 {
	public static void main(String[] args) {
		String s = "xyz";
		printPermutn(s, "");
	}
	public static void printPermutn(String str, String a) {
		if (str.length() == 0) {
			System.out.print(a + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String b = str.substring(0, i) + str.substring(i + 1);
			printPermutn(b, a + ch);
		}
	}

}

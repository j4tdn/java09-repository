package bai3;

public class Bai3 {
	public static void main(String[] args) {
		pemutation(0);
	}

	static String s = "xyz";
	static boolean[] check = new boolean[s.length()];
	static String res;

	private static void pemutation(int i) {
		if (i == s.length()) {
			System.out.println(s);
			res = "";
		} else {
			for (int j = 0; j < s.length(); j++) {
				if (!check[j]) {
					res += s.charAt(j);
					check[j] = true;
					pemutation(i + 1);
					res = res.substring(0, res.length() - 1);
					check[j] = false;
				}
			}
		}
	}
}

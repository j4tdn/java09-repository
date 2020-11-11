package ex03;

public class Ex03 {
	private static void permutation(String s ,String str) {
		permutation("",str);
	}

	private static void checkPermutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		
	}
	public static void main(String[] args) {
		String str="xyz";
		permutation("", str);
	}
}

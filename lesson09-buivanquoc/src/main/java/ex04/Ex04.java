package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String str = "Welcome   to JAVA09 class";
		String[] string = str.trim().split(" ");
		for (int i = 0; i < string.length; i++) {
			System.out.print(revert(string[i])+" ");
		}

	}

	private static String revert(String str) {
		int n = str.length();
		StringBuilder string = new StringBuilder(n);
		for (int i = n-1; i>=0; i--) {
			string.append(str.charAt(i));
		}
		return string.toString();
	}
}

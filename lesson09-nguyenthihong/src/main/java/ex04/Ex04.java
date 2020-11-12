package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s = "Welcome to JAVA09 class";
		System.out.println(revert(s));
	}

	public static String revert(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		return stringBuilder.reverse().toString();
	}
}

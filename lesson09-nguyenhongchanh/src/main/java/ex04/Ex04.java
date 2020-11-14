package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s = "Welcome to JAVA09 class";
		revert(s);
	}

	public static void revert(String s) {
		String[] strings = s.split("\\s{1}");
		
		for (String n : strings) {
		StringBuilder stringBuilder = new StringBuilder(n);
		n = stringBuilder.reverse().toString();
		System.out.print(n + " ");
		}
	}
}

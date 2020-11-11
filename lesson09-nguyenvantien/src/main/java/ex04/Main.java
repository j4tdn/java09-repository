package ex04;

public class Main {
	public static void main(String[] args) {
		String string = "   Welcome   to  Java09  class   ";
		System.out.println(revert(string));
	}
	
	private static String revert(String s) {
		String result = "";
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] arrString = s.split(" ");
		for (int i = 0; i < arrString.length; i++) {
			arrString[i] = new StringBuffer(arrString[i]).
				      reverse().toString();
		}
		result = String.join(" ", arrString);
		return result;
	}
}

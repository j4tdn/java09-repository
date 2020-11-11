package exercise04;

public class Ex04 {
	public static void main(String[] args) {
		String s = "Welcome to JAVA09 class";
		System.out.println(revert(s));
	}
	
	private static String revert (String s) {
		StringBuilder result = new StringBuilder();
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] strings = s.split(" ");
		for (String value : strings) {
			StringBuilder tmp = new StringBuilder(value);
			tmp = tmp.reverse();
			result.append(tmp + " ");
		}
		return result.toString().trim();
	}
}

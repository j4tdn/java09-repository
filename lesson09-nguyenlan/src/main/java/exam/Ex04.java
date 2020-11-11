package exam;

public class Ex04 {
	public static void main(String[] args) {
		String input = "  Welcome  to  JAVA09  class  ";
		System.out.println(revert(input));
		
	}
	private static String revert(String input) {
		String output = input.trim();
		output = output.replaceAll("\\s+", " ");
		System.out.println(output);
		String result = "";
		for(int i = output.length() - 1; i >= 0; i--) {
			result += output.charAt(i);
		}
		return result;
	}
}

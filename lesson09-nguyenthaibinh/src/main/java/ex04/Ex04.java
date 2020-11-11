package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String input = "Welcome   to       JAVA09  class";
		revert(input);
	}
	
	private static void revert(String s) {
		// abc => cba
		String result = "";
		String replaceString = s.replaceAll("[\\s]{1,}", " ");
		String[] array = replaceString.split("\\s");
		for(int i = 0; i < array.length; i++) {
			System.out.println(reverse(array[i]));
		}
	}
	private static String reverse(String str) {
		String result="";
	    for(int i=str.length()-1; i>=0; i--) {
	        result = result + str.charAt(i);
	    }
	    return result;
	}
}

package bai4;

public class Bai4 {
	public static void main(String[] args) {
		String s = "   Welcome  to Java09   ";
		
		System.out.println(revert(s));
	}
	
	private static String revert(String s) {
		String result = "";
		s = s.trim();
		String[] words = s.split("[\\s]++");
		for (String word:words) {
			String revert = "";
			for (int i=word.length()-1; i>=0; i--) {
				revert += word.charAt(i);
			}
			
			result += revert + " ";
		}
		
		return result.substring(0,result.length()-1);
	}
}

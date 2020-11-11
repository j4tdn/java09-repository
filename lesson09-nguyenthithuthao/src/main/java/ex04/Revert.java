package ex04;

public class Revert {
	public static void main(String[] args) {
		String input = "  Welcome  to JAVA09  class";
		String s = input.replaceAll("\\s\\s+", " ").trim();
		System.out.println(s);
		StringBuilder s2 = new StringBuilder(s);
		s2.reverse().toString();
		System.out.println(s2);
		
		
	}
	public static void swab(String s1) {
		
		
		
	}
	

}

package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s="    Welcome to    JAVA09 class       ";
		System.out.println(s.trim().replaceAll("\\s{1,}"," "));
		
		System.out.println(reversec(s));
		
	}
	
	private static String reversec(String input){ 
		String[] s = input.split(" ");
		for(String s1: s) {
			StringBuilder result = new StringBuilder(s1);
			 result.reverse().toString();
		}
		return s.toString();
		
		
		
	}
	
}


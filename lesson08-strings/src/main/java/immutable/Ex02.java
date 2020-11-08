package immutable;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		String s = "Nguyen Thai Binh ahihi bcd";
		System.out.println("length: " + s.length());
		
		String s1 = "kkkkk";
		s += s1;
		System.out.println(s);
		
		if(s.length() > 3) {
			System.out.println("Char at 3 index: " + s.charAt(3));
		}

		Set<Character> set = new LinkedHashSet<>();
		for(int  i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		// c2:
		ex04(s, (result, input, i) -> result.indexOf(input.charAt(i)) == -1);
		
		String s2 = "i";
		System.out.println("start: " + s.indexOf(s2));
		System.out.println("end: " + s.lastIndexOf(s2));
	}
	
	private static void ex04(String s, Conditional conditional) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			if(conditional.test(result, s, i)) {
				result += s.charAt(i);
			}
		}
		
		System.out.println(result);
	}
	
}

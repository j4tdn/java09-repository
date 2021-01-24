package exam;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println(anagram("hello", "llohe"));
		
	}
	private static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
			
		Integer[]  result=new Integer[s1.length()];
		Integer[]  result2=new Integer[s1.length()];
		
		for(int i=0;i<s1.length();i++) {
			
			result[i]= s1.codePointAt(i);
			result2[i]= s1.codePointAt(i);
		}
		Arrays.sort(result);
		Arrays.sort(result2);
		for(int i=0;i<result.length;i++) {
			if(result[i]!=result2[i]) {
				return false;
			}
		}
		
		return true;
//		

	}
}

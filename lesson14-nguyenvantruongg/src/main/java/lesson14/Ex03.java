package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		
	}
	private boolean getAnagram(String news, String old) {
		if ( news.length()!=old.length()) {
			return false;
		}
		char[] seq1= news.toLowerCase().trim().toCharArray();
		char[] seq2= news.toLowerCase().trim().toCharArray();
		
		Arrays.sort(seq1);
		Arrays.sort(seq2);
		
		for ( int i=0;i<=seq1.length;i++) {
			if (seq1[i] != seq2[i] ) {
				return false;
			} 
			
			
			
		}
		return true;
		
	}
	
	private List<String> getLetter(String a) {
		List<String> result = new ArrayList<>();
		
		Set<Character> let = new HashSet<Character>();
		
		
		
		
		
		
	}
	
	
}

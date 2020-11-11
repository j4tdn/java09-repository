package exercise03;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String input = "xyz";
		String[] result = permutation(input);
		for (String value : result) {
			System.out.println(value);
		}
	}
	
	private static String[] permutation(String s) {
		ArrayList<String> rsList = new ArrayList<String>();
		String[] input = s.split("");
		Arrays.sort(input);
		rsList.add(String.join("", input));
		for(int i = input.length - 1; i > 0; i--){
	        if(input[i].compareTo(input[i - 1]) >0)
	        {
	            
	            for(int j = input.length - 1; j >= i; j--)
	            {
	                if(input[j].compareTo(input[i-1]) > 0)
	                {
	                    String temp = input[j];
	                    input[j] = input[i - 1];
	                    input[i - 1] = temp;
	                    break;
	                }
	            }
	 
	            for(int j = input.length - 1; j > ((input.length - 1 + i) / 2); j--)
	            {
	                String temp = input[i + input.length - 1 - j];
	                input[i + input.length - 1 - j] = input[j];
	                input[j] = temp;
	            }
	    
	            
	            rsList.add(String.join("", input));
	            i = input.length;
	        }
	    }
		int index =0;
		String[] result = new String[rsList.size()];
		for (int i =0; i< rsList.size();i++) {
			result[i] = rsList.get(i);
		}
		return result;
	}
}

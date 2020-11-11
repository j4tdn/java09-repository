package ex03;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String s="xyz";
		ArrayList<String> strings = permutation(s);
		for (String string : strings) {
			System.out.println(string);
		}
	}

	
	public static ArrayList<String> permutation(String s) {
	    ArrayList<String> res = new ArrayList<String>();
	    if (s.length() == 1) {
	        res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        String last = s.substring(lastIndex);
	        String rest = s.substring(0, lastIndex);
	        res = merge(permutation(rest), last);
	    }
	    return res;
	}
	 
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<String>();
	    for (String s : list) {
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}
}

package demo;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(StringChallenge("h3llko", "hello"));
	}
	
	public static String StringChallenge(String str1, String str2) {
	    for (int i = 0; i < str2.length(); i++) {
	    	char c = str2.charAt(i);
	    	if (str1.contains(c + "")) {
	    		str1.replace(c + "", "");
	    	} else {
	    		return "false";
	    	}
	    }
	    return "true";
	}
}

package immuatable;

public class Ex02 {
	
	public static void main(String[] args) {
	String s1 ="how are you, thanks".replace(" ", "");
	String s2 =" a";
	
	System.out.println(s1.length());
	System.out.println(s1+s2);
	System.out.println(s1.charAt(4));
	//Conditional con = ( result,  input,  i) -> !result.contains(String.valueOf(input.charAt(i)));
		
	
	System.out.println(getUniqueChars(s1, ( result,  input,  i) -> !result.contains(String.valueOf(input.charAt(i)))));
	
	//Conditional con1= ( result,  input,  i) -> !(input.substring(0, i).indexOf( String.valueOf(input.charAt(i))))==-1));
		
	
	System.out.println(getUniqueChars2(s1,( result,  input,  i) -> !((input.substring(0, i).indexOf( String.valueOf(input.charAt(i))))==-1)));
	
	}
	
	private static String getUniqueChars(String s,Conditional conditional) {
				String results="";
		for(int i = 0 ; i< s.length();i++) {
			if(conditional.test(results, s , i)) {
				results = results +	s.charAt(i);
		}
			
	}
		return results;
		
	}

//	private static String getUniqueChars(String s) {
//		String results="";
//		for(int i = 0 ; i< s.length();i++) {
//			String c = String.valueOf(s.charAt(i));
//			if(!results.contains(c)) {
//				results=results.concat(c);
//			};
//		}
//		return results;
//		
//	}
	private static String getUniqueChars2(String s,Conditional conditional) {
			String results="";
		for( int i = 0; i < s.length();i++){
			if(conditional.test(results,s, i)){
				results = results +	s.charAt(i);
		}
			
		}
		return results;
	}
	
//	private static String getUniqueChars2(String s) {
//		String results="";
//		for( int i = 0; i < s.length();i++){
//			String preStrings = s.substring(0, i);
//			String c = String.valueOf(s.charAt(i));
//			if(!((preStrings.indexOf(c))==-1)) {
//				results  =results + c;
//			}
//			
//		}
//		
//		
//		return results;
//		
//	}
}



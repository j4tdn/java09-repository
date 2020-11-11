package lesson09;

public class Ex04 {


	public static void main(String[] args) {
		String input = "welcome tojava09 class";
		System.out.println(reverse(input));
		// cắt chuỗi: split
		// 
	}
	
	private static String reverse(String input){ 
		//String s1= "A, B, C, D";
		//s1.split(", ");
		
		StringBuilder result = new StringBuilder();
		for (int i = input.length()-1; i >= 0; i--) {
			result.append(input.charAt(i));
		}
		return result.toString();
	}
	
	//private String reversec2(String input){ 
		//StringBuilder result = new StringBuilder(input);
		//return result.reverse().toString();
	//}
	//"[\\s]+"
}


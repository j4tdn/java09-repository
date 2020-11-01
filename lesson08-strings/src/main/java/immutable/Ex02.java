package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "abcdede";
		String s2 = "e";
		System.out.println("Length: " + s1.length());

		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(3));

		System.out.println("==");
//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.indexOf(s1.charAt(i)) == s1.lastIndexOf(s1.charAt(i))) {
//				System.out.print(s1.charAt(i));
//			}
//		}
		
		Conditional condition = (result, input, i) -> !result.contains(String.valueOf(input.charAt(i)));
		System.out.println(getUniqueChars(s1, condition));
		
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.lastIndexOf(s2));
	}

	private static String getUniqueChars(String input, Conditional condition) {
		String result = "";
		for(int i=0;i<input.length();i++) {
			if(condition.test(result, input, i)) {
				result += input.charAt(i);
			}
		}
		return result;
	}

}

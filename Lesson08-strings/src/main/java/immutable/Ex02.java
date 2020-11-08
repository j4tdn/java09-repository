package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "hell hello";

		String s2 = "hi lochii";
		// 1
		length(s1);
		// 2
		s1s2(s1, s2);
		// 3
		System.out.println(s1.charAt(2));
		// 4
		Conditional conditional = (String result, String input,
				int i) -> !result.contains(String.valueOf(input.charAt(i)));
		Conditional conditional2 = (String result, String input,
				int i) -> input.substring(0, i).indexOf(input.charAt(i)) == -1;

		System.out.println(getUniqueChar(s1, conditional));
		System.out.println(getUniqueChar(s2, conditional2));
		// 5

//		for(int j=0;j<s1.length();j++) {
//			if(s1.charAt(j)=='h') {
//				System.out.println(s1.indexOf(ch));
//			}
//		}
	}

	private static void length(String string) {
		System.out.println(string.length());
	}

	private static void s1s2(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	private static String getUniqueChar(String input, Conditional conditional) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			String c = String.valueOf(input.charAt(i));
//			string c=""+input.charAt(i);
			if (conditional.test(result, input, i)) {
				result = result.concat(c);

			}
		}
		return result;
	}

}

package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s = "how are you,";
		System.out.println(s.length());
		String s1 = "thanks";
		s = s + s1;
		System.out.println(s);
		System.out.println(s.charAt(4));
		s.replace(" ", "");
		getUniqueChar(s, (input,i) -> input.substring(0, i).indexOf(input.charAt(i)) == -1);
		
		System.out.println();
		System.out.println("start:" + s.indexOf("a"));
		System.out.println("end:" + s.lastIndexOf("a"));
	}
	private static void getUniqueChar (String input,Conditional conditional) {
		for (int i = 0; i < input.length(); i++) {
			if (conditional.test(input, i)) {
				System.out.print(input.charAt(i) + " ");
			}
		}
	}
}

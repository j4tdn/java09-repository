package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s="how are u a?";
		String s1 = "i'm fine";
		System.out.println("1: " + s.length());
		System.out.println("2: "+ s.concat(s1));
		System.out.println("3: " + s.charAt(2));
		
		Conditional condition = (result, input, i) -> !result.contains((String.valueOf(input.charAt(i))));
		System.out.println("4: " + getUniqueChars(s, condition));
		
		String s2="a";
		System.out.println("5: start: " + s.indexOf(s2) + ", end: " + s.lastIndexOf(s2));
	}
	
	private static String getUniqueChars(String input, Conditional conditional) {
		String result ="";
		for (int i=0; i<input.length(); i++) {
			if (conditional.test(result, input, i)){
				result += input.charAt(i);
			}	
		}
		return result;
	}
}

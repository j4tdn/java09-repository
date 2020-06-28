package exercises;

import java.util.Stack;

public class Ex02 {
	public static void main(String[] args) {
		String brackets = "[](())";
		System.out.println(checkBracket(brackets));
	}

	private static boolean checkBracket(String character) {
		Stack<String> listCharacter = new Stack<String>();
		for (int i = 0; i < character.length(); i++) {
			char x = character.charAt(i);
			String s = "" + x;
			if (s.equals("(") || s.equals("[")) {
				listCharacter.push(s);
			} else {
				if (s.equals(")") && listCharacter.peek().equals("(")) {
					listCharacter.pop();
				} else if (s.equals("]") && listCharacter.peek().equals("[")) {
					listCharacter.pop();
				} else {
					return false;
				}
			}
		}
		return true;
	}
}

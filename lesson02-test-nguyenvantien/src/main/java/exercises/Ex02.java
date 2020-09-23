package exercises;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Stack<Character> st = new Stack();
		if (check(str, st)) {
			System.out.println("ok");
		} else {
			System.out.println("??");
		}

	}

	private static boolean check(String str, Stack<Character> st) {
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '(':
				st.push(')');
				break;
			case '[':
				st.push(']');
				break;
			case ')':
				if (st.pop().equals(')') == false) {
					return false;
				}
				break;
			case ']':
				if (st.pop().equals(']') == false) {
					return false;
				}
				break;
			}

		}
		return true;

	}
}


package immutable;

import java.lang.Character.Subset;

import javax.security.auth.Subject;

public class Ex02 {
	public static void main(String[] args) {
		// Tinh chuoi dai chuoi s
		// noi chuoi s1 vao s
		// lay 1 ki tu tai index = 3 trong chuoi s
		// duyet va in ra tung phan tu trong chuoi ,cac phan tu trung nhau thi in ra 1
		// lan "abcdb" => "abcd"

		// tim vi tri xuat hien dau tien va cuoi cug cua chuoi s2 tring chuoi s
		// s= "how are you, thanks"
		// s2 = "a"
		// kqua : start 4, end 13
		String s = "How are you, thanks".replace(" ", "");
		String s1 = "fine";
		String s2 = "a";
		System.out.println(s.length());
		System.out.println(s + s1);
		System.out.println("============");
		System.out.println(s.charAt(3));
		// Conditional conditional = (result, input, i) ->
		// !result.contains(String.valueOf(input.charAt(i)));

		System.out.println(getUnitqueChars(s, (result, input, i) -> !result.contains(String.valueOf(input.charAt(i)))));
		System.out.println(
				getUnitqueChars(s, (result, input, i) -> input.substring(0, i).indexOf(input.charAt(i)) == -1));

	}

//cach 1: duyet và in ra ki tu khong trung
	private static String getUnitqueChars(String s, Conditional conditional) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (conditional.test(result, result, i)) {
				result = result.concat(c);
			}

		}
		return result;
	}

	// cach 2 duyet và in ra ki tu khong trung
	/*private static String getUnitqueCharsC2(String input) {
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(0, i).indexOf(input.charAt(i)) == -1) {
				result = result + input.charAt(i);
			}

		}

		return result;
	}
*/
}

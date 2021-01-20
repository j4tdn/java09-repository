
public class Bai3 {
	public static void main(String[] args) {
		isAnagram("Java", "ajavv");
	}

	public static void isAnagram(String a, String b) {
		String s1 = a.replaceAll(" ", "");
		String s2 = b.replaceAll(" ", "");

		boolean status = true;
		if (a.length() != b.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toUpperCase().toCharArray();
			char[] ArrayS2 = s2.toUpperCase().toCharArray();
			status = s1.equals(s2);
		}
		if (status) {
			System.out.println(a + " and " + b + " is anagram");
		} else {
			System.out.println(a + " and " + b + " is not anagram");
		}
	}
}

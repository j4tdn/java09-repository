package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s1 = "wellcome    to java09    class";
		String s2 = s1.trim().replace("\\s{1,}", " ");
		String[] s = s2.split("[\\s]+");
		//System.out.println(s);
		System.out.println(revert(s));
	}

	private static String revert(String[] st) {
		// int index= 0;
		String result = "";
		for (String s : st) {

			for (int i = s.length()-1; i >= 0; i--) {
				String c = String.valueOf(s.charAt(i));
				result = result + c;

			}
			result =result+" ";

//		
		}
		return result;
	}
}

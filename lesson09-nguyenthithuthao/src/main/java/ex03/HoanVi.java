package ex03;

public class HoanVi {
	public static void main(String[] args) throws Exception {
		String s = "xyz";
		permutation(s, " ");
	}

	private static void permutation(String s, String index) {
		if (s.length() == 0) {
			System.out.print(index + " ");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char chuoi = s.charAt(i);
			String h = s.substring(0, i) + s.substring(i + 1);
			permutation(h, index + chuoi);
		}
	}
}

package batap1;

public class Cau3 {

	public static boolean checkSoDoiXung(int a) {
		String temp = "" + a;
		for (int i = 0; i < temp.length() / 2; i++) {
			if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkSoDoiXung(13331));
	}
}

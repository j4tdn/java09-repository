package ex03;

public class Ex03 {

	private static int n;
	private static boolean used[];
	private static int a[];
	private static String[] result;
	private static int count = 0;
	private static String string;

	public static void main(String[] args) {
		string = "xyz";
		n = string.length();
		used = new boolean[n];
		a = new int[n];
		result = new String[giaithua(n)];
		back(0);

		for (String s : result) {
			System.out.println(s);
		}
	}

	public static int giaithua(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * giaithua(n - 1);
	}

	public static void back(int p) {
		if (p == n) {
			addIntoResult();
			return;
		}
		for (int i = 0; i < n; i++)
			if (!used[i]) {
				a[p] = i;
				used[i] = true;
				back(p + 1);
				used[i] = false;
			}
	}

	public static void addIntoResult() {
		StringBuilder s = new StringBuilder("");
		
		for (int i = 0; i < n; i++) {
			s.append(string.charAt(a[i]));
		}
		result[count++] = s.toString();
	}
}

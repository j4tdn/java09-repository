package exam;

import java.util.Random;

public class Ex03 {
	static Random rd = new Random();

	public static void main(String[] args) {
		String input = "xyz";
		String[] result = randMoreNotLoop(input);
		for (String s : result) {
			System.out.println(s);
		}

	}

	private static String[] randMoreNotLoop(String input) {
		String[] temp = new String[giaithua(input.length())];
		int count = 0;
		while (count < temp.length) {
			String var = randOneNotLoop(input);
			if (isContainString(temp, var)) {
				continue;
			}
			temp[count++] = var;
		}

		return temp;
	}

	private static String randOneNotLoop(String input) {
		int n = input.length();
		String result = "";
		int count = 0;
		int[] temp = new int[n];
		while (count < n) {
			int var = rd.nextInt(n);
			while (isContain(temp, var)) {
				var = rd.nextInt(n);
			}
			temp[count++] = var;
			result += var;
		}
		return result;
	}

	private static boolean isContain(int[] temp, int var) {
		for (int i : temp) {
			if (i == var) {
				return true;
			}
		}
		return false;
	}

	private static boolean isContainString(String[] temp, String var) {
		for (String i : temp) {
			if (i.equals(var)) {
				return true;
			}
		}
		return false;
	}

	private static int giaithua(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return n;
		}
		return n * giaithua(n - 1);
	}
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CauG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = "", b = "", S = "";
		int k, sumLength;
		int test;
		test = scanner.nextInt();
		boolean arr[] = new boolean[test];
		int j = 0;
		for (int i = 0; i < test; i++) {
			String subS="";
			k = scanner.nextInt();
			scanner.nextLine();
			S = scanner.nextLine();
			a = scanner.nextLine();
			b = scanner.nextLine();
			String s="";
//			for(int g = 0;g<S.length();g++) {
//				for(int h=0;h<S.length();h++) {
//					s= S.substring(S.indexOf(a, 0), S.lastIndexOf(b, 0));
//				}
//			}
			s= S.substring(S.indexOf(a, 0), S.lastIndexOf(b, 0));
			sumLength = k + a.length() + b.length();
			String subFirst = s.substring(0, a.length());
			int index = s.length() - b.length();
			String subLast = s.substring(index, s.length());
			boolean check = true;
			if (subFirst.equals(a) == false) {
				check = false;
			}
			if (subLast.equals(b) == false) {
				check = false;
			}
			if (s.length() > sumLength) {
				check = false;
			}
			String sCase = s.toLowerCase();
			if (s.equals(sCase) == false) {
				check = false;
			}
			Pattern pattern = Pattern.compile("[a-z]+");
			if (pattern.matcher(s).matches() == false) {
				check = false;
			}
			arr[j] = check;
			j++;
		}
		for (boolean c : arr) {
			if (c == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}

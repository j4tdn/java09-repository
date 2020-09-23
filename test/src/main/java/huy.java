

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huy {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			Duyet();
		}
	}

	private static void Duyet() {
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int beginIndex = 0;
		int check = 0;
		List<Integer> beginStringNumbers = new ArrayList<Integer>();
		do {
			check = s.indexOf(a, beginIndex);
			beginIndex = check + a.length();
			if(check != -1) {
				beginStringNumbers.add(check);
			}
		} while(check != -1);
		
		beginIndex = 0;
		List<Integer> endStringNumbers = new ArrayList<Integer>();
		do {
			check = s.indexOf(b, beginIndex);
			beginIndex = check + b.length();
			if(check != -1) {
				endStringNumbers.add(check + b.length());
			}
		} while(check != -1);
		
		if(beginStringNumbers.isEmpty() || endStringNumbers.isEmpty()) {
			System.out.println("NO");
			return;
		}
		
		for(Integer x : beginStringNumbers) {
			for(Integer y : endStringNumbers) {
				if(y > x) {
					if(y - x <= a.length() + b.length() + k) {
						System.out.println("YES");
						return;
					} else {
						break;
					}
				}
			}
		}
		System.out.println("NO");
	}
}


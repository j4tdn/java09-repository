package beans;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mainA {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			a.add(t);
		}
		

		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			
			for (int j = i; j < a.size(); j++) {
				List<Integer> sub = a.subList(i, j + 1);
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				for(int k =0;k<sub.size();k++) {
					tmp.add(sub.get(k));
				}
				Collections.sort(tmp);
				b.add(tmp.get(tmp.size() / 2));
			}

		}

		Collections.sort(b);
		System.out.println(b.get(b.size()/2));
	}
}

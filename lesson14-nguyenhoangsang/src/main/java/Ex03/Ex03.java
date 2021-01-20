package Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap chuoi 1 :");
		String str1 = sc.nextLine();
		
		System.out.print("Moi nhap chuoi 2 :");
		String str2 = sc.nextLine();
		
		String[] listChar1 = str1.split("");
		String[] listChar2 = str2.split("");
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		for (String i : listChar1) {
			list1.add(i);
		}
		
		for (String i : listChar2) {
			list2.add(i);
		}
		
		List<String> ls1 = list1.stream()
								.sorted()
								.collect(Collectors.toList());
		
		List<String> ls2 = list2.stream()
								.sorted()
								.collect(Collectors.toList());
		
		boolean check = true;
		if (ls1.size() != ls2.size()) {
			check = false;
		} else {
			for (int i = 0 ; i < ls1.size() ; i ++) {
				if (!ls1.get(i).equals(ls2.get(i))) {
					check = false;
				}
			}
		}
		System.out.println("Ket qua la : " + check);
	}
}

package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		List a = new ArrayList();
		List b = new LinkedList();

		a.add(1);
		a.add("Welcome");
		a.add(2f);

		System.out.println(a);
		System.out.println(b);
	}
}

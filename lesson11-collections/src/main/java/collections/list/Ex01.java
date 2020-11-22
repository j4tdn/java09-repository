package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		
		//raw type: moi phan tu la kieu object
		//giong voi : Object[] a = new Object[];
		List a = new ArrayList();
		List b = new LinkedList();
		
		a.add(1);
		a.add("Welcome");
		a.add(1f);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		for(Object item : a) {
			System.out.println(Integer.parseInt(item.toString()));
		}
	}
}

package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		//prior verrsion 1.4
		List a=new ArrayList();
		List b=new LinkedList();
		
		
		a.add(1);
		a.add("hi");
		a.add(2f);
		
		for(Object item:a) {
			System.out.println(Integer.parseInt(item.toString()));
		}
		
//		System.out.println(a);
		System.out.println();
	}
}

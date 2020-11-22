package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		//raw type : eac element is an object as default
		List a=new ArrayList();
		List b=new LinkedList();
		a.add(1);
		a.add("hello");
		a.add(1.5);
		
		//could get errora at runtime
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}

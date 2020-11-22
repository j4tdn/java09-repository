package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		// prior 1.4
		// raw type: each element is an object as default
		List a = new ArrayList();
		List b = new LinkedList();
		
		a.add(4);
		a.add("hehe");
	}
}

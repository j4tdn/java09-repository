package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
	 public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 10, 15, 28, 29, 100, 70, 6, 90, 21, 56, 49, 35, 66, 20));
	    List<Integer> list2 = new ArrayList<Integer>();
	    List<Integer> list3 = new ArrayList<Integer>();
	    
	    for (int i =0; i < list.size();i++) {
	    	int x = list.get(i); 
	    	if (x%5==0 && x%7!=0) {
	    		list3.add(x);
	    		list.remove(i);
	    		i--;
	    	}
	    	
	    	if ((x%7==0 && x%5==0) || (x%7!=0 && x%5!=0)) {
	    		list2.add(x);
	    		list.remove(i);
	    		i--;
	    	}
	    }
	    list.addAll(list2);
	    list.addAll(list3);
	    System.out.println(list);
	}
}

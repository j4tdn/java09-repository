package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences=new ArrayList<>();
		sequences.add("cake");
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		
		String firstElement=sequences.get(0);
		System.out.println("First Element:"+ firstElement);
		
		sequences.set(2, "chocopie");
		System.out.println("size:"+sequences.size());
		
		printf(sequences);
		
		sequences.remove("cake");
		System.out.println();
		remove(sequences,"r");
		printf(sequences);
	}
	private static void printf(List<String> sequences) {
		for(String sq:sequences) {
			System.out.print(sq+" ");
		}
	}
	private static void remove(List<String> sequences,String text) {
		//concurentModificatuonException
		//cannot remove using element
		//for(String sq:sequences) {
		//	if(sq.startsWith(text)) {
		//		sequences.remove(sq);
		//	}
		//}
	    Iterator<String> iterator=sequences.iterator();
	    while(iterator.hasNext()) {
	    	String sq=iterator.next();
	    	if(sq.startsWith(text)) {
	    		iterator.remove();
	    	}
	    }
	}
}

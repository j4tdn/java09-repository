package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		// list = resize able - array
		// capacity: sức chứa
		List<String> sequences = new ArrayList<String>();
		sequences.add("cake");
		sequences.add("cake"); // chocopie
		sequences.add("small candy"); 
		sequences.add("big cookie");
		sequences.set(1, "chocopie");
		String firstElement = sequences.get(0);
		System.out.println("firstElement: " + firstElement);
		
		// remove
		sequences.remove("cake");
		
		// remove by conditional: startWith('c')
		remove(sequences, "c");
		
		// startWith(s)
		sequences.removeIf(t -> t.startsWith("s"));
		
		System.out.println("size: " + sequences.size());
		printf(sequences);
	}
	
	private static void remove(List<String> sequences, String text) {
		// cookie, chocopie
		// ConcurrentModificationException
		// Cannot remove using element
//		for (String sequence: sequences) {
//			if(sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
		
		Iterator<String> iterator = sequences.iterator();
		while(iterator.hasNext()) {
			String sequence = iterator.next();
			if (sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}
	
	private static void printf(List<String> sequences) {
		 for (String sequence: sequences) {
			 System.out.println(sequence);
		 }
	}
}

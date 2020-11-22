package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		// List = resize able-array
		// capacity: sức chứa
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("cake");//chocopie
		sequences.add("candy");
		sequences.add("water");
		sequences.add("sfebf");
//		String firstElement = sequences.get(0);
//		System.out.println("First element: " + firstElement);
		sequences.set(1, "chocopie");
		
		//remove by conditional: startWith('c');
		
		remove(sequences, "c");
		// implement Queue
		
		
		//removeIf 
		sequences.removeIf(t -> t.startsWith("s")); 
		System.out.println("size: " + sequences.size());
		prinf(sequences);
		
		
	}

	private static void remove(List<String> sequences, String text) {
		//=>>>> ConcurrentModificationException
		//can not remove using element
		Iterator<String> iterator = sequences.iterator();
		while(iterator.hasNext()) {
			String sequence = iterator.next();
			if(sequence.startsWith(text)) {
				iterator.remove();
			}
		}
		
		/*for(String sequence: sequences) {
			if(sequence.startsWith(text)) {
				sequences.remove(sequence);
			}
		}*/ 
		
		
	}

	private static void prinf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}

}

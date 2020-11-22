package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		// list
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		
		System.out.println("size: " + sequences.size());
		printf(sequences);
		
		System.out.println(sequences.get(0));
		sequences.set(1, "chocopie");
		printf(sequences);
		
		// remove
		sequences.remove(1);
		printf(sequences);
		
		// remove by conditional: startWith('c');
//		remove(sequences, "c");
		printf(sequences);
		
		// remove If
		sequences.removeIf(t -> t.startsWith("c"));
		printf(sequences);
	}
	
	private static void printf(List<String> sequences) {
		for (String string : sequences) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
	
	private static void remove(List<String> sequences, String text) {
		// Cannot remove using element
//		for (String sequence : sequences) {
//			if(sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
		
		Iterator<String> iterator = sequences.iterator();
		while(iterator.hasNext()) {
			String sequence = iterator.next();
			if(sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}
}

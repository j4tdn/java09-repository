package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList();

		// add
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		System.out.println(sequences.size());

		// get
		String firstElement = sequences.get(0);
		System.out.println("first:" + firstElement);

		// set
		sequences.set(1, "rice");

		// remove
		sequences.remove(2);
		// remove by conditional:startWith('c');

		//remove(sequences, "c");
	
				printf(sequences);

	}
	private static void remove(List<String > sequences, String text) {
		Iterator<String> iterator =sequences.iterator();
		while(iterator.hasNext()) {
			String sequence=iterator.next();
			if(sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}

//	private static void remove(List<String> sequences, String text) {
//		for (String sequence : sequences) {
//			if (sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
//	}


	private static void printf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}

}

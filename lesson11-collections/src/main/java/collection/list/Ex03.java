package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("small candy");
		sequences.add("big cookie");
		String firstElement = sequences.get(0);
		System.out.println("firstElement: " + firstElement);
		sequences.set(2, "chocopie");
		sequences.remove("cake");
		// remove by conditional:startWith('c')
		System.out.println("size :" + sequences.size());
		printf(sequences);
		remove(sequences, "c");
		sequences.removeIf(t -> t.startsWith("s"));

	}

	private static void printf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence + " ");
		}
	}

	private static void remove(List<String> sequences, String text) {
//		for (String sequence : sequences) {
//			if (sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String sequence = iterator.next();
			if (sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}

}

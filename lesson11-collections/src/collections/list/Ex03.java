package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// list: resize able - array
		// capacity
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("cake");

		sequences.add("candy");// => rice
		sequences.add("water");
		sequences.add("cookie");

		// lay phan tu
		String firstElement = sequences.get(0);

		// thay doi
		sequences.set(1, "chocopie");

		// remove
		sequences.remove("cake");

		// remove by conditional: start with c
		remove(sequences, "c");

		sequences.removeIf(t -> t.startsWith("s"));
		// predicate: truyen dieu kien. Truyen T tra ve boolean

		System.out.println("first element: " + firstElement);

		System.out.println("sequences: " + sequences);
		System.out.println("size: " + sequences.size());

		printf(sequences);
	}

	private static void remove(List<String> sequences, String text) {
		/*
		 * for(String sequence: sequences) { if(sequence.startsWith(text)) {
		 * sequences.remove(sequence); } }
		 */
		// ConcurrentModificationException cannot remove using element

		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String sequence = iterator.next();
			if (sequence.startsWith(text)) {
				iterator.remove();
			}
		}

	}

	private static void printf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}
}

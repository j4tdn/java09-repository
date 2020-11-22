
package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class Ex03 {
	public static void main(String[] args) {

		// list = resize able - array
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");

		String firStElement = sequences.get(0);

		sequences.set(1, "rice");// them,update
		// remove
		sequences.remove("cake");
		// xoas phaanf tuwr
		remove(sequences, "c");
		// startWith(s)
		sequences.removeIf(t -> t.startsWith("s"));
		System.out.println("firStElement: " + firStElement);
		System.out.println(" size: " + sequences.size());
		printf(sequences);

	}

	private static void f(List<String> sequences) {

	}

	private static void remove(List<String> sequences, String text) {
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String sequance = iterator.next();
			if (sequance.startsWith(text)) {
				iterator.remove();
			}
//		for(String sequence: sequences) {
//			if(sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
		}
	}

	private static void printf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}

}

package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("cookies");
		sequences.add("water");
		
		String firstElement = sequences.get(0);
		System.out.println("firstElement: " + firstElement);
		
		sequences.set(1, "rice");
		
		System.out.println("size: " + sequences.size());
		
		printf(sequences);
		System.out.println("===============");
		
		sequences.remove("cake");

		//remove if
		sequences.removeIf(t -> t.startsWith("s"));
		
		//remove by condition: startWith ('c')
		remove(sequences, "c");
		printf(sequences);
	}
	
	private static void printf(List<String> sequences) {
		for (String sequence:sequences) {
			System.out.println(sequence);
		}
	}
	
	private static void remove(List<String> sequences, String text) {
		//ConcurrentModificationException
		//Cannot remove using element
//		for (String sequence:sequences) {
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

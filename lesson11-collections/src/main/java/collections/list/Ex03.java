package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("candy");
		sequences.add("candy");
		sequences.add("water");
		
//		System.out.println("size: " + sequences.size());
//		printf(sequences);
//		sequences.set(1, "rice");
//		printf(sequences);
		removeElement(sequences, "c");
//		sequences.removeIf(item -> item.startsWith("c"));
	}
	
	private static void printf(List<String> sequences) {
		for(String item : sequences) {
			System.out.println(item);
		}
	}
	
	private static void removeElement(List<String> sequences, String prefix) {
		Iterator<String> iterator = sequences.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().startsWith(prefix)) {
				iterator.remove();
			}
		}
		System.out.println(sequences.size());
	}
}

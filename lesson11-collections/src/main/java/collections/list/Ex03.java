package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		
		String firstElement = sequences.get(0);
		System.out.println("First element:" + firstElement);
		// remove
		sequences.remove("cake");
		// remove by conditional
//		sequences.removeIf(t -> t.startsWith("c"));
		remove(sequences, "c");
		
//		sequences.set(1, "rice");		
		System.out.println("size:" + sequences.size());
		printf(sequences);
	}
	
	private static void remove (List<String> sequences,String text) {
		// cannot using foreach to remove or add 
		// concurrent modified exception
		
		Iterator<String> iterator =  sequences.iterator();
		while (iterator.hasNext()) {
			String sequence = iterator.next();
			if (sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}
	private static void printf (List<String> sequences) {
		for (String sequence :sequences) {
			System.out.println(sequence);
		}
	}
}

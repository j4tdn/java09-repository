package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<String>();
		sequences.add("cake");
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("cookie");
		
		String firstElement = sequences.get(0);
		sequences.set(1, "chocopie");
		
		sequences.remove("cake");
		
		remove(sequences, "c");
		
		sequences.removeIf(t -> t.startsWith("s"));
		
		
		System.out.println("size: "+ sequences.size());
		System.out.println("firsrElement "+ firstElement);
		printf(sequences);
 	}
	
	private static void printf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);
		}
	}
	
	/*private static void remove (List<String> sequences, String s) {
		for (String sequence : sequences) {
			if(sequence.startsWith(s)) {
				System.out.println("sequence "+ sequence);
				sequences.remove(sequence);
				System.out.println("size " + sequences.size());
			}
		}
	}*/
	
	private static void remove(List<String> sequences, String text) {
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String sequence = iterator.next();
			if (sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}
	
	

}

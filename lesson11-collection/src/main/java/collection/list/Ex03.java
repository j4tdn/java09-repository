package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		// list = resize able - array
		// capacity

		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		// add last
		// implement Queue
		System.out.println("size: " + sequences.size());
		String firstElement = sequences.get(0);
		System.out.println("firestelement: " + firstElement);
		//remove 
		sequences.remove("cake");
		//remove by conditional : startWith('c');
		remove(sequences, "c");
		
		
		sequences.removeIf(t -> t.startsWith("s"));
		sequences.set(1, "rice");
		prinf(sequences);	
	}

	private static void prinf(List<String> sequences) {
		for (String sequence : sequences) {
			System.out.println(sequence);

		}
	}
	private static void remove(List<String> sequences, String text ) {
		//concurrentMordificactionException
		//cannot remove using element
//		for (String sequence: sequences) {
//			if(sequence.startsWith(text)) {
//				sequences.remove(sequence);
//				System.out.println("se"+sequence);
//				System.out.println("lenght: "+ sequences.size());
//				
//			}
//		}
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			//kiem tra con phan tu nao khong
			String sequence =iterator.next();
			if(sequence.startsWith(text)) {
				iterator.remove();
			}
		}
	}
}

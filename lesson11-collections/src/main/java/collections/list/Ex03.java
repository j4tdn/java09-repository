package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collections.utils.ListUtils;

public class Ex03 {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");

		String firstElement = sequences.get(0);
		sequences.set(1, "rice");
		// remove
		sequences.remove(0);
		// remove by conditional
		sequences.removeIf(t -> t.startsWith("c"));
		System.out.println("size: " + sequences.size());
		System.out.println("firstElement" + firstElement);

		ListUtils.printfString(sequences);
	}

	private static void remove(List<String> sequences, String text) {
		Iterator<String> iterator = sequences.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.startsWith(text)) {
				iterator.remove();
			}
		}
	}

}

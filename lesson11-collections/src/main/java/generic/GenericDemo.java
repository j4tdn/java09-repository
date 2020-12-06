package generic;

import java.util.function.Predicate;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		System.out.println("size: " + digits.size());
		System.out.println("isEmpty: " + digits.isEmpty());
		IList<String> sequences = new JavaList<String>();
		sequences.add("welcome  to java 09!!!!!!");
		sequences.add("cheers from:");
		sequences.add("welcome  to java 10!!!!!!");
		
		System.out.println(sequences.count(t -> t.startsWith("welcome")));

	}
}

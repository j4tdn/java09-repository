package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		System.out.println(digits.hashCode());
		digits.add(10);
		digits.add(20);
		digits.add(30);
		System.out.println(digits.hashCode());
		digits.add(40);

		System.out.println(digits.hashCode());
		System.out.println("size: " + digits.size());
		System.out.println("size: " + digits.isEmpty());
		
		IList<String> sequences = new JavaList<>();
		sequences.add("welcome to Java09");
		sequences.add("cheers from Java09");
		sequences.add("hello from Java09");
		System.out.println("=========================");
		System.out.println(sequences.count(sequence -> sequence.startsWith("welcome")));
		System.out.println(sequences.count(null)); 

	}
}

package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<Integer>();
		System.out.println(digits.hashCode());
		digits.add(100);
		digits.add(100);
		digits.add(100);
		digits.add(100);
		System.out.println(digits.size());
		System.out.println(digits.isEmpty());
	}
}

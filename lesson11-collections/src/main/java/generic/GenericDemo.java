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

	}
}

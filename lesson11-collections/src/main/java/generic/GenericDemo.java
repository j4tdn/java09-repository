package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(20);
		digits.add(30);
		digits.add(10);
		System.out.println("size: " + digits.size());
		System.out.println("empty: " + digits.isEmpty());
	}
}

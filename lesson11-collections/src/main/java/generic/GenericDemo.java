package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<Integer>();
		digits.add(10);
		System.out.println("size: " + digits.size());
		System.out.println("size: " + digits.isEmpty());

	}
}

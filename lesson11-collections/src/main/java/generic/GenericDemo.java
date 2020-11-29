package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(15);
		
		System.out.println(digits.isEmpty());
		System.out.println(digits.get(0));
	}
}
